/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

readDataFromFile.java
This file creates the readDataFromFile window where the user chooses what text file to read
and then places the data in the manualInputScreen window.
*/

package sspicalculator;
import java.io.*;
import java.util.*;

public class readDataFromFile extends javax.swing.JFrame
{

    public readDataFromFile()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        fileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileChooser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                try
                {
                  if(evt.getActionCommand().equals("ApproveSelection"))
                  {
                    File input_file = fileChooser.getSelectedFile();
                    Scanner input = new Scanner(input_file);
                    manualInputScreen letsGo = new manualInputScreen(null, true);
                    letsGo.setTitle("Manual Input Screen");
                    while(input.hasNextLine())
                    {
                      letsGo.inputTextArea.append(input.nextLine() + "\n");
                    }
                    input.close();
                    dispose();
                    letsGo.setVisible(true);
                    if(evt.getActionCommand().equals("CancelSelection"))
                      dispose();
                    }
                }
                catch (IOException ie)
                {
                  System.out.println("Input File cannot be opened... Please try again");
                }
          }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new readDataFromFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    // End of variables declaration//GEN-END:variables
}
