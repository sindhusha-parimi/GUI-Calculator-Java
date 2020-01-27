
/************************************************************
 *                                                          *
 *  CSCI 470/502          Assignment 7           Fall 2018  *                                             
 *                                                          *
 *  Programmer: Sindhusha Devi Parimi                       *  
 *                                                          *
 *  Date Due:   11/07/2018 11:59 PM                         *                          
 *                                                          *
 *  Purpose:   To create a Align GUI with different         *
 *             JComponents  .                               *
 *             .                                            *
 * 
 *                                                          *
 ***********************************************************/ 

import javax.swing.JFrame;

public class AlignmentTest 
{
  public static void main(String[] args)
  {
    JFrame align = new Alignment();
    align.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    align.setVisible(true);
    align.setSize(450,180);
    align.setLocationRelativeTo(null);
  }
}
