package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PlayerAndComputer extends JPanel {
    private static int xx = 0;
    private static int oo = 0;
    private final JPanel panel;
    private static final int[] setSign = new int[9];
    private static final JButton[] arrBut = new JButton[9];
    private static final int min = 20;

    public PlayerAndComputer() {

        panel = new JPanel(new GridLayout(3, 3), true);
        panel.setPreferredSize(new Dimension(150, 150));
        for (int i = 0; i < arrBut.length; i++) {

            arrBut[i] = new JButton();
            arrBut[i].setBackground(Color.WHITE);
            int finalI = i;
            arrBut[i].addActionListener(event -> {
                {
                    arrBut[finalI].setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Крестик.gif"));
                    xx++;
                    setSign[finalI] = 100;

                    arrBut[finalI].setDisabledIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Крестик.gif"));
                    arrBut[finalI].setEnabled(false);
                }
                winner();

                ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                executorService.schedule(PlayerAndComputer::moveOO, 500, TimeUnit.MILLISECONDS);
            });
            panel.add(arrBut[i]);
        }
    }

    public JPanel getPanel() {
        return panel;
    }


    public static boolean whoWin() {

        if (xx <= 5) {
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
                //   System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 300) {
                //   System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[6] + setSign[7] + setSign[8] == 60) {
                System.out.println("Игра окончена. Нолики выиграли.");
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
                //    System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[1] + setSign[4] + setSign[7] == 60) {
                //    System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 300) {
                //    System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[5] + setSign[8] == 60) {
                //   System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 300) {
                //   System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[0] + setSign[4] + setSign[8] == 60) {
                //  System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 300) {
                //   System.out.println("Игра окончена. Крестики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Крестики выиграли.");
                return true;
            } else if (setSign[2] + setSign[4] + setSign[6] == 60) {
                //    System.out.println("Игра окончена. Нолики выиграли.");
                JOptionPane.showMessageDialog(null, "Игра окончена. Нолики выиграли.");
                return true;
            }
        } else {
            System.out.println("Игра окончена. Победитель не определился.");
            //  JOptionPane.showMessageDialog(null, "Игра окончена. Победитель не определился.");
        }
        return false;
    }

    public static void moveOO() {

        if (setSign[4] == 0) {
            findEmptyCellInLine(4);
        } else if (setSign[0] + setSign[1] + setSign[2] == 40) {
            if (setSign[0] > setSign[1]) {
                findEmptyCellInLine(1);
            }
            if (setSign[0] > setSign[2]) {
                findEmptyCellInLine(2);
            }
            if (setSign[0] < setSign[1]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[3] + setSign[4] + setSign[5] == 40) {
            if (setSign[3] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[3] > setSign[5]) {
                findEmptyCellInLine(5);
            }
            if (setSign[3] < setSign[4]) {
                findEmptyCellInLine(3);
            }
        } else if (setSign[6] + setSign[7] + setSign[8] == 40) {
            if (setSign[6] > setSign[7]) {
                findEmptyCellInLine(7);
            }
            if (setSign[6] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[6] < setSign[7]) {
                findEmptyCellInLine(6);
            }
        } else if (setSign[0] + setSign[3] + setSign[6] == 40) {
            if (setSign[0] > setSign[3]) {
                findEmptyCellInLine(3);
            }
            if (setSign[0] > setSign[6]) {
                findEmptyCellInLine(6);
            }
            if (setSign[0] < setSign[3]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[1] + setSign[4] + setSign[7] == 40) {
            if (setSign[1] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[1] > setSign[7]) {
                findEmptyCellInLine(7);
            }
            if (setSign[1] < setSign[4]) {
                findEmptyCellInLine(1);
            }
        } else if (setSign[2] + setSign[5] + setSign[8] == 40) {
            if (setSign[2] > setSign[5]) {
                findEmptyCellInLine(5);
            }
            if (setSign[2] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[2] < setSign[5]) {
                findEmptyCellInLine(2);
            }
        } else if (setSign[0] + setSign[4] + setSign[8] == 40) {
            if (setSign[0] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[0] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[0] < setSign[4]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[2] + setSign[4] + setSign[6] == 40) {
            if (setSign[2] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[2] > setSign[6]) {
                findEmptyCellInLine(6);
            }
            if (setSign[2] < setSign[4]) {
                findEmptyCellInLine(2);
            }
        } else if (setSign[0] + setSign[1] + setSign[2] == 200) {
            if (setSign[0] > setSign[1]) {
                findEmptyCellInLine(1);
            }
            if (setSign[0] > setSign[2]) {
                findEmptyCellInLine(2);
            }
            if (setSign[0] < setSign[1]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[3] + setSign[4] + setSign[5] == 200) {
            if (setSign[3] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[3] > setSign[5]) {
                findEmptyCellInLine(5);
            }
            if (setSign[3] < setSign[4]) {
                findEmptyCellInLine(3);
            }
        } else if (setSign[6] + setSign[7] + setSign[8] == 200) {
            if (setSign[6] > setSign[7]) {
                findEmptyCellInLine(7);
            }
            if (setSign[6] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[6] < setSign[7]) {
                findEmptyCellInLine(6);
            }
        } else if (setSign[0] + setSign[3] + setSign[6] == 200) {
            if (setSign[0] > setSign[3]) {
                findEmptyCellInLine(3);
            }
            if (setSign[0] > setSign[6]) {
                findEmptyCellInLine(6);
            }
            if (setSign[0] < setSign[3]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[1] + setSign[4] + setSign[7] == 200) {
            if (setSign[1] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[1] > setSign[7]) {
                findEmptyCellInLine(7);
            }
            if (setSign[1] < setSign[4]) {
                findEmptyCellInLine(1);
            }
        } else if (setSign[2] + setSign[5] + setSign[8] == 200) {
            if (setSign[2] > setSign[5]) {
                findEmptyCellInLine(5);
            }
            if (setSign[2] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[2] < setSign[5]) {
                findEmptyCellInLine(2);
            }
        } else if (setSign[0] + setSign[4] + setSign[8] == 200) {
            if (setSign[0] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[0] > setSign[8]) {
                findEmptyCellInLine(8);
            }
            if (setSign[0] < setSign[4]) {
                findEmptyCellInLine(0);
            }
        } else if (setSign[2] + setSign[4] + setSign[6] == 200) {
            if (setSign[2] > setSign[4]) {
                findEmptyCellInLine(4);
            }
            if (setSign[2] > setSign[6]) {
                findEmptyCellInLine(6);
            }
            if (setSign[2] < setSign[4]) {
                findEmptyCellInLine(2);
            }
        } else {
            Random rand = new Random();
            LinkedList<Integer> allCone = new LinkedList<>();
            if (setSign[0] == 0) allCone.add(0);
            if (setSign[2] == 0) allCone.add(2);
            if (setSign[6] == 0) allCone.add(6);
            if (setSign[8] == 0) allCone.add(8);
            int randomIndex = rand.nextInt(allCone.size());
            int randomElement = (int) allCone.get(randomIndex);
            findEmptyCellInLine(randomElement);

        }

    }

    public static void winner() {

        if (whoWin()) {
            for (JButton jButton : arrBut) {
                jButton.setEnabled(false);
            }

        }

    }

    public static void findEmptyCellInLine(int numberCell) {
        setSign[numberCell] = min;
        oo++;
        arrBut[numberCell].setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Нолик.gif"));
        arrBut[numberCell].setDisabledIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\tic-tac-toe\\Нолик.gif"));
        arrBut[numberCell].setEnabled(false);
        winner();
    }
}
