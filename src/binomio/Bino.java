/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Bino extends JFrame implements ActionListener{
    private JLabel Titulazo, comx, comy;
    private JTextField  X, Y, R; 
    private JButton obtener;       
    private JLabel comz;
    private JLabel comp;
    private JLabel com2;
    private JLabel igual;
    
    public Bino() {
        super();                    
        Ventana();        
        inicializarComponentes();        
    }
    
    private void Ventana() {
        this.setTitle("Binomio");                   
        this.setSize(500, 400);                         
        this.setLayout(null);                                   
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    private void inicializarComponentes(){
        Titulazo = new JLabel();
        comx = new JLabel();
        comy = new JLabel();
        comz = new JLabel();
        comp = new JLabel();
        com2 = new JLabel();
        igual= new JLabel();
        
        X = new JTextField();
        Y = new JTextField();
        R = new JTextField();
        
        obtener = new JButton();
        
        Titulazo.setText("BINOMIO AL CUADRADO");
        Titulazo.setBounds(25, 30, 450, 30);
        Titulazo.setFont(new Font("Arial", Font.BOLD, 36));
        add(Titulazo);
        
        comx.setText("(");
        comx.setBounds(40, 90, 450, 90);
        comx.setFont(new Font("Arial", Font.BOLD, 70));
        add(comx);
        
        X.setBounds(70, 110, 80, 60);
        X.setFont(new Font("Arial", Font.BOLD, 70));
        X.setHorizontalAlignment(JTextField.CENTER);
        X.addKeyListener(new KeyAdapter(){
               @Override
               public void keyTyped(KeyEvent e)
               {
                  char caracter = e.getKeyChar();
                  if(X.getText().length()<2){}
                  else
                     e.consume();
                  if(Character.isLetter(caracter)){
                      e.consume();
                  }
               }
            });
        add(X);
        
        comy.setText("X+");
        comy.setBounds(160, 95, 450, 90);
        comy.setFont(new Font("Arial", Font.BOLD, 70));
        add(comy);
        
        Y.setBounds(250, 110, 80, 60);
        Y.setFont(new Font("Arial", Font.BOLD, 70));
        Y.setHorizontalAlignment(JTextField.CENTER);
        Y.addKeyListener(new KeyAdapter(){
               @Override
               public void keyTyped(KeyEvent e)
               {
                  char caracter = e.getKeyChar();
                  if(X.getText().length()<2){}
                  else
                     e.consume();
                  if(Character.isLetter(caracter)){
                      e.consume();
                  }
               }
            });
        add(Y);
        
        comz.setText("Y");
        comz.setBounds(340, 95, 450, 90);
        comz.setFont(new Font("Arial", Font.BOLD, 70));
        add(comz);
        
        comp.setText(")");
        comp.setBounds(400, 90, 450, 90);
        comp.setFont(new Font("Arial", Font.BOLD, 70));
        add(comp);
        
        com2.setText("2");
        com2.setBounds(425, 60, 450, 90);
        com2.setFont(new Font("Arial", Font.BOLD, 40));
        add(com2);
        
        obtener.setText("Calcular");
        obtener.setBounds(140,190,200,30);
        obtener.setFont(new Font("Arial",Font.PLAIN, 20));
        obtener.addActionListener(this);
        add(obtener);
        
        igual.setText("=");
        igual.setBounds(220,200, 450, 90);
        igual.setVisible(false);
        igual.setFont(new Font("Arial", Font.BOLD, 70));
        add(igual);
        
        R.setBounds(0, 270,500, 70);
        R.setFont(new Font("Arial", Font.BOLD, 48));
        R.setHorizontalAlignment(JTextField.CENTER);
        R.setEditable(false);
        R.setBackground(null);
        R.setBorder(null);
        add(R);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==obtener){
            int pt;
            int st;
            int tt;
            pt=(int)Math.pow(Integer.parseInt(X.getText()), 2);
            st=2*Integer.parseInt(X.getText())*Integer.parseInt(Y.getText());
            tt=(int)Math.pow(Integer.parseInt(Y.getText()), 2);
            igual.setVisible(true);
            R.setText(pt+"x²+"+st+"xy+"+tt+"y²");
        }
    }
}
