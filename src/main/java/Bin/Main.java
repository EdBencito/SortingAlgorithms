package Bin;

import com.sparta.algorithms.BubbleSort;
import com.sparta.algorithms.QuickSort;
import com.sparta.data.GenerateArray;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel basePanel;
    private JButton sortButton;
    private JRadioButton bubbleSortRadioButton;
    private JRadioButton quickSortRadioButton;
    private JRadioButton generateRandomIntegersRadioButton;
    private JRadioButton generateRandomCharactersRadioButton;
    private JLabel algorithmsHeader;
    private JLabel arrayHeader;
    private JTextArea textArea1;
    private JRadioButton binaryTreeSortRadioButton;
    private JRadioButton arrayRadioButton;
    private JRadioButton arrayListRadioButton;

    public Main() {
        BubbleSort b = new BubbleSort();
        QuickSort q = new QuickSort();
        GenerateArray g = new GenerateArray();
        textArea1.setEditable(false);
        generateRandomIntegersRadioButton.setSelected(true);

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                if (bubbleSortRadioButton.isSelected() == false && quickSortRadioButton.isSelected() == false && binaryTreeSortRadioButton.isSelected() == false) {
//                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Please Select an Algorithm", "ERROR", JOptionPane.ERROR_MESSAGE);
//                } else if (bubbleSortRadioButton.isSelected() == true && datastructure == 1 && datatype == 1) {
//                    System.out.println("Bubble Sort on Array with Randomly Generated Integers Selected" + "\n");
//                    System.out.println("Bubble Sort Complete:" + Arrays.toString(b.sort(ar.generate(10000)))); // Working
//                } else if (bubbleSortRadioButton.isSelected() == true && datastructure == 1 && datatype == 2) {
//                    System.out.println("Bubble Sort on Array with Randomly Generated Characters Selected" + "\n");
//                    System.out.println("Bubble Sort Complete:" + Arrays.toString(b.sort(ar.generateC(10000))));
//                } else if (bubbleSortRadioButton.isSelected() == true && datastructure == 2 && datatype == 1) {
//                    System.out.println("Bubble Sort on Array List with Randomly Generated Integers Selected" + "\n");
//                    System.out.println("Bubble Sort Complete:" + b.sort(arl.generate(10000)));
//                } else if (bubbleSortRadioButton.isSelected() == true && datastructure == 2 && datatype == 2) {
//                    System.out.println("Bubble Sort on Array List with Randomly Generated Characters Selected" + "\n");
//                    System.out.println("Bubble Sort Complete:" + b.sort(arl.generateC(10000)));
//                } else if (algo == 2 && datastructure == 1 && datatype == 1) {
//                    System.out.println("Quick Sort on Array with Randomly Generated Integers Selected" + "\n");
//                    System.out.println("Quick Sort (Hoare partition Scheme) Complete:" + Arrays.toString(q.sort(ar.generate(10000)))); // Working
//                } else if (algo == 2 && datastructure == 1 && datatype == 2) {
//                    System.out.println("Quick Sort on Array with Randomly Generated Characters Selected" + "\n");
//                    System.out.println("Quick Sort Complete:" + Arrays.toString(q.sort(ar.generateC(10000))));
//                } else if (algo == 2 && datastructure == 2 && datatype == 1) {
//                    System.out.println("Quick Sort on Array List with Randomly Generated Integers Selected" + "\n");
//                    System.out.println("Quick Sort Complete:" + q.sort(arl.generate(10000)));
//                } else if (algo == 2 && datastructure == 2 && datatype == 2) {
//                    System.out.println("Quick Sort on Array List with Randomly Generated Characters Selected" + "\n");
//                    System.out.println("Quick Sort Complete:" + Arrays.toString(q.sort(ar.generateC(10000))));
//                }
            }
        });
        generateRandomCharactersRadioButton.addActionListener(new

                                                                      ActionListener() {
                                                                          @Override
                                                                          public void actionPerformed(ActionEvent e) {
                                                                              generateRandomIntegersRadioButton.setSelected(false);

                                                                          }
                                                                      });
        generateRandomIntegersRadioButton.addActionListener(new

                                                                    ActionListener() {
                                                                        @Override
                                                                        public void actionPerformed(ActionEvent e) {
                                                                            generateRandomCharactersRadioButton.setSelected(false);
                                                                        }
                                                                    });
        bubbleSortRadioButton.addActionListener(new

                                                        ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                quickSortRadioButton.setSelected(false);
                                                            }
                                                        });
        quickSortRadioButton.addActionListener(new

                                                       ActionListener() {
                                                           @Override
                                                           public void actionPerformed(ActionEvent e) {
                                                               bubbleSortRadioButton.setSelected(false);
                                                           }
                                                       });
        binaryTreeSortRadioButton.addActionListener(new

                                                            ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {

                                                                }
                                                            });
        arrayRadioButton.addActionListener(new

                                                   ActionListener() {
                                                       @Override
                                                       public void actionPerformed(ActionEvent e) {

                                                       }
                                                   });
        arrayListRadioButton.addActionListener(new

                                                       ActionListener() {
                                                           @Override
                                                           public void actionPerformed(ActionEvent e) {

                                                           }
                                                       });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().basePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
