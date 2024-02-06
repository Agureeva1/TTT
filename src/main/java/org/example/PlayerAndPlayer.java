package org.example;

import javax.swing.*;
import java.awt.*;

public class PlayerAndPlayer extends JPanel {
    private static int x = 0;
    private static int o = 0;
    private final JPanel panel;
    private static  int[] setSign = new int[9];
    private static  JButton[] arrBut = new JButton[9];

    public PlayerAndPlayer() {

        panel = new JPanel(new GridLayout(3, 3), true);
        panel.setPreferredSize(new Dimension(150, 150));
        for (int i = 0; i < arrBut.length; i++) {

            arrBut[i] = new JButton();
            arrBut[i].setBackground(Color.WHITE);
            int finalI = i;
            arrBut[i].addActionListener(event -> {
                if (x <= o) {
                    arrBut[finalI].setIcon(new ImageIcon("src/pic/Крестик.gif"));
                    x++;
                    setSign[finalI] = 100;

                    arrBut[finalI].setDisabledIcon(new ImageIcon("src/pic/Крестик.gif"));
                    arrBut[finalI].setEnabled(false);
                } else {
                    arrBut[finalI].setIcon(new ImageIcon("src/pic/Нолик.gif"));
                    o++;
                    setSign[finalI] = 20;

                    arrBut[finalI].setDisabledIcon(new ImageIcon("src/pic/Нолик.gif"));
                    arrBut[finalI].setEnabled(false);

                }
                isWinner();

            });
            panel.add(arrBut[i]);
        }
    }

    public JPanel getPanel() {
        return panel;
    }

    public static boolean isWin() {

        if (x <= 5) {
            if (setSign[0] + setSign[1] + setSign[2] == 300) {
           //     System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[1] + setSign[2] == 60) {
            //    System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[3] + setSign[4] + setSign[5] == 300) {
            //    System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[3] + setSign[4] + setSign[5] == 60) {
           //     System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 300) {
           //     System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 60) {
           //     System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[0] + setSign[3] + setSign[6] == 300) {
             //   System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[3] + setSign[6] == 60) {
            //    System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[1] + setSign[4] + setSign[7] == 300) {
           //     System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[1] + setSign[4] + setSign[7] == 60) {
             //   System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 300) {
             //   System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 60) {
             //   System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 300) {
            //    System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 60) {
            //    System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 300) {
            //    System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 60) {
           //     System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            }
        } else {
            System.out.println("Игра окончена. Победитель не определился.");
           // JOptionPane.showMessageDialog(null, "Игра окончена. Победитель не определился.");
        }
        return false;
    }
    public static void isWinner() {

        if (isWin()) {
            for (JButton jButton : arrBut) {
                jButton.setEnabled(false);
            }

        }

    }

    public static int[] getSetSign() {
        return setSign;
    }

    public static JButton[] getArrBut() {
        return arrBut;
    }

    public static void setX(int x) {
        PlayerAndPlayer.x = x;
    }

    public static void setO(int o) {
        PlayerAndPlayer.o = o;
    }

    public static void setSetSign(int[] setSign) {
        PlayerAndPlayer.setSign = setSign;
    }

    public static void setArrBut(JButton[] arrBut) {
        PlayerAndPlayer.arrBut = arrBut;
    }
}
