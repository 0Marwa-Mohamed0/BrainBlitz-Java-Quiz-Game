package com.quiz.project.quizapp;

import static com.quiz.project.quizapp.DBConnection.connect;
import java.awt.Color;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {
    Register () {
       JFrame window = new JFrame ("Register");
       window.setSize(400, 260);
       window.setDefaultCloseOperation(3);
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       
       JPanel panel = new JPanel ();
       panel.setLayout(new GridLayout(4, 2 , 10 , 10));
       panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
       panel.setBackground(new Color(240, 240, 240));
       window.add(panel);
       
       JLabel namelabel = new JLabel ("Name:");
       JTextField name = new JTextField ();
       
       JLabel passwordlabel = new JLabel ("Password:");
       JPasswordField password = new JPasswordField();
       
       JLabel emailLabel = new JLabel ("Email:");
       JTextField email = new JTextField ();
       
       JButton logButton = new JButton ("Login");
       logButton.setBackground(Color.GRAY);
       logButton.setForeground(Color.white);
       logButton.setFocusPainted(false);
       logButton.addActionListener((e) -> {
           window.dispose();
           Login L = new Login ();
       });
        
       JButton RegButton = new JButton ("Register");
       RegButton.setBackground(new Color (44,176,175));
       RegButton.setForeground(Color.white);
       RegButton.setFocusPainted(false);
       RegButton.addActionListener((e) -> {
        try {
           String sql = "insert into users (username, password, email) values (?,?,?)" ;
           PreparedStatement query = connect().prepareStatement(sql) ;
           query.setString(1, name.getText());
           query.setString(2, new String(password.getPassword()));
           query.setString(3, email.getText());
           
           query.executeUpdate();
           JOptionPane.showMessageDialog(null,"You Registered Successfully");
        
        } catch (SQLException ex) {
          Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "Erorr!!");
        
        }
          
       });
       
       panel.add(namelabel);
       panel.add(name);
       panel.add(passwordlabel);
       panel.add(password);
       panel.add(emailLabel);
       panel.add(email);
       panel.add(logButton);
       panel.add(RegButton);
       
       window.setVisible(true);
       }
    
}
