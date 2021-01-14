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

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import javax.swing.table.DefaultTableModel;
public class Diando07228_DaftarMahasiswaGUI {
    JFrame dm=new JFrame();
    JLabel indexl,namal,npml,jurusanl,kelasl,atasl;
    JTextArea aread;
    JButton kembalilah,edit,hapus;
    
    public Diando07228_DaftarMahasiswaGUI(){
    dm.setSize(1360, 800);
    dm.setLayout(null);
    dm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dm.setVisible(true);
    dm.setLocationRelativeTo(null);
    
    dm.getContentPane().setBackground(Color.CYAN);
    atasl =new JLabel("Tampilan Data Mahasiswa");
    atasl.setBounds(500,45,550 ,30);
    atasl.setFont(new Font("Times New Roman",Font.BOLD,35));
    dm.add(atasl);
    
   aread=new JTextArea();
   aread.setBackground(Color.decode("#FFFFFF"));
   aread.setBounds(300, 120, 850, 500);
   dm.add(aread);
   
   kembalilah=new JButton("Back");
   kembalilah.setBackground(Color.red);
   kembalilah.setBounds(30, 700, 70, 35);
   dm.add(kembalilah);
   
   edit=new JButton("Edit");
   edit.setBackground(Color.white);
   edit.setBounds(1180, 400, 70, 35);
   
   dm.add(edit);
   
   kembalilah=new JButton("Hapus");
   kembalilah.setBackground(Color.red);
   kembalilah.setBounds(1180, 300, 70, 35);
   dm.add(kembalilah);
   
   
   kembalilah.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dm.dispose();
            new  Diando07228_GUIutama();
        }
    });
   
    edit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    
    
}

   
}

