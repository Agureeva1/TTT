package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.example.PlayerAndComputer.*;
import static org.example.PlayerAndPlayer.setO;
import static org.example.PlayerAndPlayer.setX;


public class DialogFrame extends JFrame {
    PlayerAndComputer playerAndComputer = new PlayerAndComputer();
    PlayerAndPlayer playerAndPlayer = new PlayerAndPlayer();
    private JPanel sButtonPanel = new JPanel();
    private JPanel wPanel = new JPanel();
    private JPanel ePanel = new JPanel();
    private JPanel nPanel = new JPanel();

    private JPanel panel1 = new JPanel();

    private JButton button1 = new JButton("Один игрок");
    private JButton button2 = new JButton("Два игрока");
    private JButton newGame = new JButton("новая игра");

    private JPanel currentPanel = panel1;

    public DialogFrame() {
        super.setTitle("Крестики-Нолики ");
        Image img = new ImageIcon("src/pic/Крестики-нолики.gif").getImage();
        this.setIconImage(img);
        this.setPreferredSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel1.setPreferredSize(new Dimension(150, 150));

        sButtonPanel.setPreferredSize(new Dimension(300, 50));
        wPanel.setPreferredSize(new Dimension(60, 300));
        ePanel.setPreferredSize(new Dimension(60, 300));
        nPanel.setPreferredSize(new Dimension(300, 50));




        sButtonPanel.setLayout(new FlowLayout());
        sButtonPanel.add(button1);
        sButtonPanel.add(button2);


        JLabel choirs = new JLabel("<html> <br>" +
                "<br>" + "Количество игроков:<br></html>");
        choirs.setFont(new Font("Serif", Font.BOLD, 16));

        panel1.add(choirs, BorderLayout.CENTER);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(nPanel, BorderLayout.NORTH);
        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(sButtonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(wPanel, BorderLayout.WEST);
        this.getContentPane().add(ePanel, BorderLayout.EAST);

        button1.addActionListener(this::buttonClick);
        button2.addActionListener(this::buttonClick);

        pack();

    }

    private void buttonClick(ActionEvent e) {
        this.getContentPane().remove(currentPanel);

        if (e.getSource().equals(button1)) {
            this.getContentPane().add(playerAndComputer.getPanel(), BorderLayout.CENTER);
            currentPanel = playerAndComputer.getPanel();
            nPanel.setBackground(new Color(75, 211, 135));
            ePanel.setBackground(new Color(75, 211, 135));
            wPanel.setBackground(new Color(75, 211, 135));
            sButtonPanel.setBackground(new Color(75, 211, 135));
            nPanel.add(newGame);

           newGame.addActionListener(event -> {
              setXx(0);
               setOo(0);
              for (int i = 0; i < PlayerAndComputer.getArrBut().length; i++) {
                  PlayerAndComputer.getArrBut()[i].setIcon(null);
                  PlayerAndComputer.getArrBut()[i].setEnabled(true);
                 int [] setSign = new int[9];
                  PlayerAndComputer.setSetSign(setSign);
              }
          });

        } else if (e.getSource().equals(button2)) {
            this.getContentPane().add(playerAndPlayer.getPanel(), BorderLayout.CENTER);
            currentPanel = playerAndPlayer.getPanel();
            nPanel.setBackground(new Color(250, 243, 104, 239));
            ePanel.setBackground(new Color(250, 243, 104, 239));
            wPanel.setBackground(new Color(250, 243, 104, 239));
            sButtonPanel.setBackground(new Color(250, 243, 104, 239));
            nPanel.add(newGame);

            nPanel.add(newGame);
            newGame.addActionListener(event -> {
                setX(0);
                setO(0);
                for (int i = 0; i < PlayerAndPlayer.getArrBut().length; i++) {
                    PlayerAndPlayer.getArrBut()[i].setIcon(null);
                    PlayerAndPlayer.getArrBut()[i].setEnabled(true);
                    int [] setSign = new int[9];
                    PlayerAndPlayer.setSetSign(setSign);
                }
            });


        }
        currentPanel.revalidate();
        this.repaint();
    }
}


