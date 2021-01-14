/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author CLIENT
 */
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Diando07228_MahasiswaGUI {
    JFrame lgn=new JFrame();
    JLabel data;
    JTextArea area;
    JButton tombolbc;
    public Diando07228_MahasiswaGUI(){
        
        lgn.setSize(240,360 );
        lgn.setBackground(Color.decode("#91546"));
        lgn.setLayout(null);
        lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lgn.setVisible(true);
        lgn.setLocationRelativeTo(null);
        
        data=new JLabel("Data Mahasiswa ITATS");
        data.setBounds(40, 20, 150, 30);
        
    }
        
}
