/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

manualInputScreen.java
This file is where the user will manually input the data to calculate the voting power of the
given groups. If the user chooses to read in from a file, this file we open again and the
data from the file will automatically populate the text feild.

The file also has a help button which is what users will click when they need to know the
format in which to enter the data manually.
*/

package sspicalculator;
import java.util.*;

public class manualInputScreen extends javax.swing.JDialog
{

    public manualInputScreen(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    //Auto-Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        helpButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                helpButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                submitButtonActionPerformed(evt);
            }
        });

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(helpButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_submitButtonActionPerformed
        resultsScreen letsGo = new resultsScreen(null, true);
        letsGo.setTitle("Results Screen");
        ArrayList<ArrayList<subGroup>> input_datas =
          new ArrayList<ArrayList<subGroup>>();
        ArrayList<subGroup> input_data = new ArrayList<subGroup>();
        String[] all_line = inputTextArea.getText().split("\n");
        for(int i = 0; i < all_line.length; i++)
        {
            String sans_title = all_line[i].split(":")[1].trim();
            String[] all_groups = sans_title.split(" ");
            for(int k = 0; k < all_groups.length; k++)
            {
                input_data.add(new subGroup((all_groups[k].split("-")[0]),
                Integer.parseInt(all_groups[k].split("-")[1]),
                all_line[i].split(":")[0], k));
            }

            input_datas.add(input_data);
            input_data = new ArrayList<subGroup>();
        }

        int fact = 0;

        for(int c = 0; c < input_datas.size(); c++)
        {
            fact = input_datas.get(c).size(); //Set Factorial
            for(int i = fact - 1; i > 1; i--)
            fact *= i;

            ArrayList<ArrayList<subGroup>> all_groups =
              manualPermutations(input_datas.get(c));
            input_datas.set(c, getPivotVoter(all_groups,
              getPivotVoteCount(input_datas.get(c))));

            // Set effective voting power loop
            for(int i = 0; i < input_datas.get(c).size(); i++)
                input_datas.get(c).get(i).setEffectiveVotingPower(
                  Math.round(input_datas.get(c).get(i).getPivotCount()/
                  (double)fact*1000000)/10000.0);

            Collections.sort(input_datas.get(c), new subGroupComparator());

            String line = String.format("%25s:",
              input_datas.get(c).get(0).getRegionName());
            for(int i = 0; i < input_datas.get(c).size(); i++)
            {
                if(i < input_datas.get(c).size() - 1)
                    line = line + String.format("%10s-%08.4f%%",
                      input_datas.get(c).get(i).getGroupName(),
                      input_datas.get(c).get(i).getEffectiveVotingPower());

                else
                    line = line + String.format("%10s-%08.4f%%\n",
                      input_datas.get(c).get(i).getGroupName(),
                      input_datas.get(c).get(i).getEffectiveVotingPower());
            }

            letsGo.resultsTextArea.append(line);
          }
          letsGo.resultsTextArea.setEditable(false);
          dispose();
          letsGo.setVisible(true);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_helpButtonActionPerformed
        helpScreen letsGo = new helpScreen();
        letsGo.setTitle("Help Screen");
        letsGo.helpTextArea.append("The format needed to fuction properly is:\n\n");
        letsGo.helpTextArea.append("GroupName: x1-pop x2-pop xn-pop\n\n");
        letsGo.helpTextArea.append("Where group name is the name of the group of subgroups\n");
        letsGo.helpTextArea.append("Where xn is the name of the subgroup\n");
        letsGo.helpTextArea.append("Where pop is the population of the subgroup\n");
        letsGo.helpTextArea.setEditable(false);
        letsGo.setAlwaysOnTop(true);
        letsGo.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                manualInputScreen dialog =
                  new manualInputScreen(new javax.swing.JFrame(), true);
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

    public static ArrayList<subGroup> getPivotVoter(ArrayList<ArrayList<subGroup>> subGroup_List, int pivotVoteCount)
    {
        int total_votes = 0;
        ArrayList<subGroup> pvc = new ArrayList<subGroup>();
        pvc = subGroup_List.get(0);
        for(int i = 0; i < subGroup_List.size(); i++)
        {
            total_votes = 0;
            for(int j = 0; j < subGroup_List.get(i).size(); j++)
            {
                total_votes += subGroup_List.get(i).get(j).getPopulation();
                if(total_votes >= pivotVoteCount)
                {
                    pvc.set(pvc.lastIndexOf(subGroup_List.get(i).get(j)),
                      subGroup_List.get(i).get(j).isPivotVoter());
                    break;
                }
            }
        }
        return pvc;
    }

    public static int getPivotVoteCount(ArrayList<subGroup> subGroup_List)
    {
        double pivotVoteCount = 0;
        for(subGroup g: subGroup_List)
            pivotVoteCount += g.getPopulation();

        pivotVoteCount /= 2;
        pivotVoteCount = Math.ceil(pivotVoteCount);
        pivotVoteCount++;

        return (int)pivotVoteCount;
    }

    public static ArrayList<ArrayList<subGroup>> manualPermutations(ArrayList<subGroup> input_list)
    {
	     ArrayList<ArrayList<subGroup>> all_permutations =
        new ArrayList<ArrayList<subGroup>>();
       all_permutations.add(new ArrayList<subGroup>());

	     for (int i = 0; i < input_list.size(); i++)
	     {
	        ArrayList<ArrayList<subGroup>> current_build =
            new ArrayList<ArrayList<subGroup>>();

	        for (ArrayList<subGroup> sg : all_permutations)
	        {
	            for (int j = 0; j < sg.size()+1; j++)
	            {
	                sg.add(j, input_list.get(i));
	                ArrayList<subGroup> temp = new ArrayList<subGroup>(sg);
	                current_build.add(temp);
	                sg.remove(j);
	            }
	        }
	        all_permutations = new ArrayList<ArrayList<subGroup>>(current_build);
	    }

	    return all_permutations;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpButton;
    public javax.swing.JTextArea inputTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
