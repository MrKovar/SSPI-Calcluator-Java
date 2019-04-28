/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

SplashScreen.java
This file is just the splash screen per the name. It includes a "credits" button to lead to a
window where I give credit to those who helped make this project possible
*/

package sspicalculator;

public class SplashScreen extends javax.swing.JFrame
{

    public SplashScreen()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        continueButton = new javax.swing.JButton();
        title1Label = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        creditsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                continueButtonActionPerformed(evt);
            }
        });

        title1Label.setText("Calculating Voting Power");

        title2Label.setText("Using the Shapley-Shubik Power Index");

        nameLabel.setText("by Cody Kovar");

        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                creditsButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sspicalculator/McMLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(creditsButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(title1Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(title2Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(nameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2)))
                .addGap(0, 210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(title1Label)
                .addGap(18, 18, 18)
                .addComponent(title2Label)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton)
                    .addComponent(creditsButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_creditsButtonActionPerformed
        creditsScreen letsGo = new creditsScreen();
        letsGo.setTitle("Credits Screen");
        letsGo.creditsTextArea.append("Credits\n\n");
        letsGo.creditsTextArea.append("Dr. Paul Fabrizio, McMurry University\n");
        letsGo.creditsTextArea.append("Professor of Political Science\n\n");
        letsGo.creditsTextArea.append("Dr. Mark Thornburg, McMurry University\n");
        letsGo.creditsTextArea.append("Professor of Mathematics\n\n");
        letsGo.creditsTextArea.append("Mr. Rich Brozovic, McMurry University\n");
        letsGo.creditsTextArea.append("Professor of Computer Science\n\n");
        letsGo.creditsTextArea.append("Dr. Tina Bertrand, McMurry University\n");
        letsGo.creditsTextArea.append("Professor of Political Science\n\n");
        letsGo.creditsTextArea.setEditable(false);
        letsGo.setVisible(true);
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_continueButtonActionPerformed
        entryTypeScreen letsGo = new entryTypeScreen(null, true);
        letsGo.setTitle("Entry Type Screen");
        dispose();
        letsGo.setVisible(true);
    }//GEN-LAST:event_continueButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JButton creditsButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    // End of variables declaration//GEN-END:variables
}
