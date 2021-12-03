package com.sparta.gui;

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
    private JRadioButton generateRandomRadioButton;
    private JRadioButton insertValuesRadioButton;
    private JTextField arrayValuesTextField;
    private JLabel algorithmsHeader;
    private JLabel arrayHeader;
    private JTextArea textArea1;

    public Main() {
        BubbleSort b = new BubbleSort();
        QuickSort q = new QuickSort();
        GenerateArray g = new GenerateArray();


        textArea1.setEditable(false);
        generateRandomRadioButton.setSelected(true);
        arrayValuesTextField.setEditable(false);


        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (bubbleSortRadioButton.isSelected() == false && quickSortRadioButton.isSelected() == false) {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Please Select an Algorithm", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (bubbleSortRadioButton.isSelected()) {
                    textArea1.setText("Testing Testing Bubble Sort");
                } else if (quickSortRadioButton.isSelected()) {
                    textArea1.setText("Testing Testing Quick Sort");

                }
            }
        });
        insertValuesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomRadioButton.setSelected(false);
                arrayValuesTextField.setEditable(true);
                arrayValuesTextField.setText("");

            }
        });
        generateRandomRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertValuesRadioButton.setSelected(false);
                arrayValuesTextField.setEditable(false);
                arrayValuesTextField.setText("e.g. 1,2,3,4,5");
            }
        });
        bubbleSortRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quickSortRadioButton.setSelected(false);
            }
        });
        quickSortRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSortRadioButton.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().basePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
