/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compressor;
import comp_decomp.decompressor;
import static java.awt.Color.green;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class APPFRAME extends JFrame implements ActionListener {
    JButton CompressButton;
    JButton DecompressButton;
    
    APPFRAME(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CompressButton=new JButton("select file to compress");
        CompressButton.setBounds(20,100,200,30);
        CompressButton.addActionListener(this);
        
        DecompressButton=new JButton("select file to decompress");
        DecompressButton.setBounds(250,100,200,30);
        DecompressButton.addActionListener(this);
        
        this.add(CompressButton);
        this.add(DecompressButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(green);
        this.setVisible(true);
    }
    @Override 
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==CompressButton){
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        
        if(e.getSource()==DecompressButton){
         JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompressor.method(file);
                }
                catch(Exception ee){
                JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        
    }
}
