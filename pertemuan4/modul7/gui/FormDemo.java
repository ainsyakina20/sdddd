/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.modul7.gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author LABFIK
 */
public class FormDemo extends JFrame {
    private JPanel panel;
    private JTextField textField;
    private JButton button, newform, exit;
    private Container contentPane;
    
    public FormDemo(){
        initComponents();
    }
    private void initComponents(){
        panel = new JPanel();
        textField = new JTextField("Default text");
        button = new JButton("Klik");
        exit = new JButton("Tutup");
        newform = new JButton("New Form");
        contentPane = getContentPane();
        
        panel.add(textField);
        panel.add(button);
        panel.add(newform);
        panel.add(exit);
        setTitle("FORM DEMO");
        
        contentPane.add(panel, BorderLayout.CENTER);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                JOptionPane.showMessageDialog(null, textField.getText());
            }
        });
        
        newform.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent evt) {
                new NewForm();
            }
        });

        exit.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        
        addWindowListener(new WindowAdapter() {
        @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); 
            }
        });
        pack();
    }
    class NewForm extends JFrame{
        public NewForm(){
            initComponents();
        }
        private void initComponents(){
            setTitle("Form Baru");
            setSize(300,200);
            setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new FormDemo().setVisible(true);
    }
}
