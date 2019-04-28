/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

entryTypeScreen.java
This file creates the entryTypeScreen window where the user can choose whether to
enter the data manually or to read in from a text file, given that it has the correct format
*/

package sspicalculator;

public class entryTypeScreen extends javax.swing.JDialog
{

    public entryTypeScreen(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        readFromFileButton = new javax.swing.JButton();
        enterManuallyButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        readFromFileButton.setText("Read From File");
        readFromFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                readFromFileButtonActionPerformed(evt);
            }
        });

        enterManuallyButton.setText("Enter Manually");
        enterManuallyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                enterManuallyButtonActionPerformed(evt);
            }
        });

        titleLabel.setText("How do you want to gather the data?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterManuallyButton)
                            .addComponent(readFromFileButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(titleLabel)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(titleLabel)
                .addGap(35, 35, 35)
                .addComponent(readFromFileButton)
                .addGap(31, 31, 31)
                .addComponent(enterManuallyButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFromFileButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_readFromFileButtonActionPerformed
         readDataFromFile letsGo = new readDataFromFile();
         letsGo.setTitle("From File Input Screen");
         dispose();
         letsGo.setVisible(true);
    }//GEN-LAST:event_readFromFileButtonActionPerformed

    private void enterManuallyButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_enterManuallyButtonActionPerformed
        manualInputScreen letsGo = new manualInputScreen(null, true);
        letsGo.setTitle("Manual Input Screen");
        dispose();
        letsGo.setVisible(true);
    }//GEN-LAST:event_enterManuallyButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                entryTypeScreen dialog = new entryTypeScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton enterManuallyButton;
    private javax.swing.JButton readFromFileButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
