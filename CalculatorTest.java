
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

public class CalculatorTest 
{
  public static void main(String[] args)
  {
    Calculator calc = new Calculator();
    calc.setLayout(null);
    calc.setVisible(true);
    calc.setSize(360,470);
    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calc.setLocationRelativeTo(null);
  }
}

