/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

resultsScreen.java
This file creates the resultsScreen window where the calculated data appears on the screen.
The user also has the opportunity to try again with new data or to save the data calculated.
*/

package sspicalculator;
import java.io.*;

public class resultsScreen extends javax.swing.JDialog
{

    public resultsScreen(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        exportButton = new javax.swing.JButton();
        tryAgainButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        exportButton.setText("Export...");
        exportButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exportButtonActionPerformed(evt);
            }
        });

        tryAgainButton.setText("Try Again");
        tryAgainButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tryAgainButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeButtonActionPerformed(evt);
            }
        });

        resultsTextArea.setColumns(20);
        resultsTextArea.setRows(5);
        jScrollPane1.setViewportView(resultsTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exportButton)
                .addGap(217, 217, 217)
                .addComponent(tryAgainButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportButton)
                    .addComponent(tryAgainButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryAgainButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_tryAgainButtonActionPerformed
        entryTypeScreen letsGo = new entryTypeScreen(null, true);
        letsGo.setTitle("Splash Screen");
        dispose();
        letsGo.setVisible(true);
    }//GEN-LAST:event_tryAgainButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_exportButtonActionPerformed
        try
        {
            String[] all_line = resultsTextArea.getText().split("\n");
            File output_file = new File("output.txt");
            PrintWriter output_writer = new PrintWriter(output_file);
            for(String line: all_line)
            {
                output_writer.write(line + "\n");
                output_writer.flush();
            }
            output_writer.close();
            exportComplete letsGo = new exportComplete();
            letsGo.setTitle("Export Screen");
            letsGo.setVisible(true);
        }
        catch (IOException io)
        {
            exportComplete letsGo = new exportComplete();
            letsGo.setTitle("Export Screen");
            letsGo.exportCompleteLabel.setText("Export Failed");
            letsGo.setVisible(true);
        }

    }//GEN-LAST:event_exportButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                resultsScreen dialog = new resultsScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea resultsTextArea;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
