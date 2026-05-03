package com.quiz.project.quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Quiz2 {
    
    Quiz2 (int userid) {
    JFrame window = new JFrame ("Quiz");
       window.setSize(500, 400);
       window.setDefaultCloseOperation(3);
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       
       JPanel panel = new JPanel ();
       panel.setLayout(new GridLayout(6, 1 , 10 , 10));
       panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
       panel.setBackground(new Color(240, 240, 240));
       window.add(panel);
     
       JLabel Q1label = new JLabel ("Q2: Which one of the following is not a Java feature? :");
       Q1label.setFont(new Font("Arial", 1, 15));
       ButtonGroup Group1 = new ButtonGroup();
       JRadioButton R1 = new JRadioButton ("Object-oriented");
       JRadioButton R2 = new JRadioButton ("Use of pointers");
       JRadioButton R3 = new JRadioButton ("Portable");
       JRadioButton R4 = new JRadioButton ("Dynamic and Extensible");
       R1.setFocusPainted(false);
       R2.setFocusPainted(false);
       R3.setFocusPainted(false);
       R4.setFocusPainted(false);
        
       panel.add(Q1label);
       Group1.add(R1);
       Group1.add(R2);
       Group1.add(R3);
       Group1.add(R4);
       panel.add(R1);
       panel.add(R2);
       panel.add(R3);
       panel.add(R4);
       
       JButton nextButton = new JButton("Next");
       nextButton.setFocusPainted(false);
        nextButton.addActionListener((e) -> { 
                if (R2.isSelected()) {
                    QuizApp.score++;
                } 
                else {}
              window.dispose();
              Quiz3 Q = new Quiz3 (userid);
        });
        panel.add(nextButton);
        window.setVisible(true);
       
       
    }
    
}
