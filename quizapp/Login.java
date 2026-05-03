
package com.quiz.project.quizapp;

import static com.quiz.project.quizapp.DBConnection.connect;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Login {
    
       Login () {
       JFrame window = new JFrame ("Login");
       window.setSize(400, 300);
       window.setDefaultCloseOperation(3);
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       window.setLayout(new BorderLayout());
       
       JPanel fpanel = new JPanel ();
       fpanel.setPreferredSize(new Dimension(400,75));
       JLabel label = new JLabel("Quiz time!",SwingConstants.CENTER);
       label.setFont(new Font("Jokerman",0,55));
       label.setForeground(new Color (52, 73, 94));
       fpanel.add(label);
       window.add(fpanel,BorderLayout.NORTH);

       
       JPanel spanel = new JPanel ();
       spanel.setLayout(new GridLayout(3, 2 , 10 , 10));
       spanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
       spanel.setBackground(new Color(240, 240, 240));
       spanel.setPreferredSize(new Dimension(400,175));
       window.add(spanel,BorderLayout.SOUTH);
       
       JLabel usernamelabel = new JLabel ("Username:");
       JTextField username = new JTextField ();
       
       JLabel passwordlabel = new JLabel ("Password:");
       JPasswordField password = new JPasswordField();
       
       JButton logButton = new JButton ("Login");
       logButton.setBackground(new Color (44,176,175));
       logButton.setForeground(Color.white);
       logButton.setFocusPainted(false);
       logButton.addActionListener((e) -> {
          try{
          String sql ="Select userid from users where username = ? and password = ?";
          PreparedStatement query = connect().prepareStatement(sql);
          query.setString(1, username.getText());
          query.setString(2, new String(password.getPassword()));
          
          ResultSet result = query.executeQuery();
          
          if(result.next()){
             int userid = result.getInt(1);
              window.dispose();
              Quiz1 Q = new Quiz1 (userid);
          }
          else{
               JOptionPane.showMessageDialog(null,"Wrong Username / Password","Error!",0);
        
          }
          }
          catch(SQLException ex) {
            System.out.println(ex.getMessage());
          }
           
       }); 
        
       JButton RegButton = new JButton ("Register");
       RegButton.setBackground(Color.GRAY);
       RegButton.setForeground(Color.white);
       RegButton.setFocusPainted(false);
       RegButton.addActionListener((e) -> {
           window.dispose();
           Register R = new Register ();
           
       }); 
       
       spanel.add(usernamelabel);
       spanel.add(username);
       spanel.add(passwordlabel);
       spanel.add(password);
       spanel.add(logButton);
       spanel.add(RegButton);
       
       window.setVisible(true);
       }
}

