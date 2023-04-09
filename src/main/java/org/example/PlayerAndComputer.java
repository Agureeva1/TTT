package org.example;

import javax.swing.*;
import java.awt.*;

public class PlayerAndComputer {
    private static int xx = 0;
    private static int oo = 0;
    private JPanel panel;
    private static int[] setSign = new int[9];
    private JButton[] arrBut = new JButton[9];

    public PlayerAndComputer() {

        panel = new JPanel(new GridLayout(3, 3), true);
        panel.setPreferredSize(new Dimension(150, 150));
        for (int i = 0; i < arrBut.length; i++) {

            arrBut[i] = new JButton();
            arrBut[i].setBackground(Color.WHITE);
            int finalI = i;
            arrBut[i].addActionListener(event -> {
                if (xx <= oo) {
                    arrBut[finalI].setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Крестик.gif"));
                    xx++;
                    setSign[finalI] = 100;

                    arrBut[finalI].setDisabledIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Крестик.gif"));
                    arrBut[finalI].setEnabled(false);
                } else {
                    arrBut[finalI].setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Нолик.gif"));
                    oo++;
                    setSign[finalI] = 20;

                    arrBut[finalI].setDisabledIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Нолик.gif"));
                    arrBut[finalI].setEnabled(false);

                }
                isWin();
                if (isWin()) {
                    for (int j = 0; j < arrBut.length;j++) {
                        arrBut[j].setEnabled(false);
                    }

                }

            });
            panel.add(arrBut[i]);
        }
    }

    public JPanel getPanel() {
        return panel;
    }

    public static void setXX(int xx) {
        PlayerAndComputer.xx = xx;
    }

    public static void setOO(int oo) {
        PlayerAndComputer.oo = oo;
    }

    public static boolean isWin() {

        if (xx <= 5) {
            if (setSign[0] + setSign[1] + setSign[2] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[1] + setSign[2] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[3] + setSign[4] + setSign[5] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[3] + setSign[4] + setSign[5] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[0] + setSign[3] + setSign[6] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[3] + setSign[6] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[1] + setSign[4] + setSign[7] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[1] + setSign[4] + setSign[7] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 300) {
                System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            }
        } else {
            System.out.println("Игра окончена. Победитель не определился.");
            JOptionPane.showMessageDialog(null, "Игра окончена. Победитель не определился.");
        }
        return false;
    }
}
