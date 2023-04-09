package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(() -> {

            JFrame frame = new JFrame("Крестики-Нолики ");
            Image img = new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Крестики-нолики.gif").getImage();
            frame.setIconImage(img);
            PlayerAndPlayer game2Player = new PlayerAndPlayer();

            JPanel sPanel = new JPanel();
            sPanel.setPreferredSize(new Dimension(300, 50));
            JPanel wPanel = new JPanel();
            wPanel.setPreferredSize(new Dimension(60, 300));
            JPanel ePanel = new JPanel();
            ePanel.setPreferredSize(new Dimension(60, 300));
            JPanel nPanel = new JPanel();
            nPanel.setPreferredSize(new Dimension(300, 50));
//            JButton newGame = new JButton("Новая игра");
//            newGame.addActionListener(event -> {
//                setX(0);
//                setO(0);
//                setSetSign(new int[9]);
//                field.setArrBut(new JButton[9]);
//            });
 //           sPanel.add(newGame);





            frame.setPreferredSize(new Dimension(300, 300));
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());
           frame.add(game2Player.getPanel(), BorderLayout.CENTER);
            frame.add(sPanel, BorderLayout.SOUTH);
            frame.add(wPanel, BorderLayout.WEST);
            frame.add(ePanel, BorderLayout.EAST);
            frame.add(nPanel, BorderLayout.NORTH);


            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });


    }
}
