
/************************************************************
 *                                                          *
 *  CSCI 470/502          Assignment 7           Fall 2018  *                                             
 *                                                          *
 *  Programmer: Sindhusha Devi Parimi                       *  
 *                                                          *
 *  Date Due:   11/07/2018 11:59 PM                         *                          
 *                                                          *
 *  Purpose:   To create a Calculator GUI with minimum      *
 *             functionality.                               *
 *             .                                            *
 * 
 *                                                          *
 ***********************************************************/ 

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
  private final JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttondiv,buttonmul,buttonsub,buttonadd,buttondec,buttoneq;
  private final JTextField textfield;
  
  public Calculator()
  {
    super("Calculator");
    textfield=new JTextField();
    button1=new JButton("1");
    button2=new JButton("2");
    button3=new JButton("3");
    button4=new JButton("4");
    button5=new JButton("5");
    button6=new JButton("6");
    button7=new JButton("7");
    button8=new JButton("8");
    button9=new JButton("9");
    button0=new JButton("0");
    buttondiv=new JButton("/");
    buttonmul=new JButton("*");
    buttonsub=new JButton("-");
    buttonadd=new JButton("+");
    buttondec=new JButton(".");
    buttoneq=new JButton("=");
    
    textfield.setBounds(30,40,280,30);
    button7.setBounds(35,110,50,40);
    button8.setBounds(105,110,50,40);
    button9.setBounds(170,110,50,40);
    buttondiv.setBounds(245,110,50,40);
    
    button4.setBounds(35,180,50,40);
    button5.setBounds(105,180,50,40);
    button6.setBounds(175,180,50,40);
    buttonmul.setBounds(245,180,50,40);
    
    button1.setBounds(35,250,50,40);
    button2.setBounds(105,250,50,40);
    button3.setBounds(175,250,50,40);
    buttonsub.setBounds(245,250,50,40);
        
    button0.setBounds(35,320,50,40);
    buttondec.setBounds(105,320,50,40);
    buttoneq.setBounds(175,320,50,40);
    buttonadd.setBounds(245,320,50,40);
  
    add(textfield);
    add(button7);
    add(button8);
    add(button9);
    add(buttondiv);
    add(button4);
    add(button5);
    add(button6);
    add(buttonmul);
    add(button1);
    add(button2);
    add(button3);
    add(buttonsub);
    add(button0);
    add(buttondec);
    add(buttoneq);
    add(buttonadd);
    
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    button0.addActionListener(this);
    buttonadd.addActionListener(this);
    buttondiv.addActionListener(this);
    buttonmul.addActionListener(this);
    buttonsub.addActionListener(this);
    buttondec.addActionListener(this);
    buttoneq.addActionListener(this);
  }
 
  public void actionPerformed(ActionEvent eve)
  {
    if(eve.getSource()==button1)
      textfield.setText("1");
        
    if(eve.getSource()==button2)
      textfield.setText("2");
        
    if(eve.getSource()==button3)
      textfield.setText("3");
        
    if(eve.getSource()==button4)
      textfield.setText("4");
        
    if(eve.getSource()==button5)
      textfield.setText("5");
        
    if(eve.getSource()==button6)
      textfield.setText("6");
        
    if(eve.getSource()==button7)
      textfield.setText("7");
        
    if(eve.getSource()==button8)
      textfield.setText("8");
        
    if(eve.getSource()==button9)
      textfield.setText("9");
        
    if(eve.getSource()==button0)
      textfield.setText("0");
        
    if(eve.getSource()==buttondec)
      textfield.setText(".");
        
    if(eve.getSource()==buttonadd)
      textfield.setText("+");
    
    if(eve.getSource()==buttonsub)
      textfield.setText("-");
        
    if(eve.getSource()==buttonmul)
      textfield.setText("*");
        
    if(eve.getSource()==buttondiv)
      textfield.setText("/");
        
    if(eve.getSource()==buttoneq)
      textfield.setText("=");
        
    JOptionPane.showMessageDialog(Calculator.this,String.format("The button clicked: %s",eve.getActionCommand()));
  }
}