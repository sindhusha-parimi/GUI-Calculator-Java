
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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Alignment extends JFrame implements ActionListener
{
  private JButton B1,B2,B3;
  private JCheckBox C1,C2;
  private JLabel L1,L2;
  private JTextField T1,T2;
  
  public Alignment() 
  {
    super("Align");
    B1 = new JButton("Ok");
    B2 = new JButton("Cancel");
    B3 = new JButton("Help");
    C1 = new JCheckBox("Snap To Grid");
    C2 = new JCheckBox("Show Grid");
    L1 = new JLabel("X  :");
    L2 = new JLabel("Y  :");
    T1 = new JTextField();
    T2 = new JTextField();
    
    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    T1.addActionListener(this);
    T2.addActionListener(this);
     
    CheckBoxHandler handler = new CheckBoxHandler();
    C1.addItemListener(handler);
    C2.addItemListener(handler);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
                              layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(C2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(C1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                            .addGap(30, 30, 30)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(L1)
                                                        .addComponent(L2))
                                            .addGap(17, 17, 17)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(T2, 0, 0, Short.MAX_VALUE)
                                                        .addComponent(T1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(B3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(B2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(B1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                             );
    layout.setVerticalGroup(
                            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                                  .addGap(19, 19, 19)
                                                                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                              .addComponent(L1)
                                                                              .addComponent(T1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                              .addComponent(C1))
                                                                  .addGap(20, 20, 20)
                                                                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                              .addComponent(L2)
                                                                              .addComponent(T2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                              .addComponent(C2)))
                                                      .addGroup(layout.createSequentialGroup()
                                                                  .addContainerGap()
                                                                  .addComponent(B1)
                                                                  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                  .addComponent(B2)
                                                                  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                  .addComponent(B3)))
                                          .addContainerGap(14, Short.MAX_VALUE))
                           );
            
  }
  public void actionPerformed(ActionEvent eve)
  {
    String string = "";
    if(eve.getSource() == T1)
      string = String.format("The value entered for X : %s",eve.getActionCommand());
    if(eve.getSource() == T2)
      string = String.format("The value entered for Y : %s",eve.getActionCommand());
    if(eve.getSource() == B1 ||eve.getSource() == B2 ||eve.getSource() == B3)
      string = String.format("The button clicked  is : %s",eve.getActionCommand());
    
    JOptionPane.showMessageDialog(null,string);
  }
  private class CheckBoxHandler implements ItemListener
  {
    @Override
    public void itemStateChanged(ItemEvent event)
    {
      if(C1.isSelected())
        JOptionPane.showMessageDialog(null,"Snap To Grid is Checked");
      if(C2.isSelected())
        JOptionPane.showMessageDialog(null,"Show Grid is Checked");
    }
  }
}
     
    