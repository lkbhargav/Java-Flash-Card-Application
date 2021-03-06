/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAD;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhargav
 */
public class IAD extends javax.swing.JFrame {

    /**
     * Creates new form IAD
     */
    public IAD() {
        initComponents();
        buttonGroup.add(difficult);
        buttonGroup.add(average);
        buttonGroup.add(easy);
        buttonGroup.add(none);
        getContentPane().setBackground(Color.green);
        heading.setForeground(Color.DARK_GRAY);
        exitButton.setBackground(Color.red);
        exitButton.setForeground(Color.YELLOW);
        nextButton.setBackground(Color.darkGray);
        nextButton.setForeground(Color.white);
        add.setBackground(Color.darkGray);
        add.setForeground(Color.white);
        showAnswer.setBackground(Color.darkGray);
        showAnswer.setForeground(Color.white);
        dropdownList.setBackground(Color.lightGray);
        dropdownList.setForeground(Color.white);
        answerDefined.setBackground(Color.yellow);
        answerDefined.setForeground(Color.black);
        initial();
    }

    words w = new words();
    numberCounter nc = new numberCounter();
    int k=0;
    int d=0;
    int e=0;
    int a=0;
    int dl=0;
    int el=0;
    int al=0;
    int choice;
    int r=0;
    Random ran = new Random();
    int mmm;
    
    private void save()
    {
         ObjectOutputStream tester;
        try
             {
                 tester= new ObjectOutputStream(new FileOutputStream("test.ser")); 
                 tester.writeObject(w);
             }
             catch(IOException e)
             {
                 JOptionPane.showMessageDialog(rootPane, e.getMessage());
             }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        average = new javax.swing.JRadioButton();
        easy = new javax.swing.JRadioButton();
        none = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        definationWord = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerDefined = new javax.swing.JTextArea();
        showAnswer = new javax.swing.JButton();
        dropdownList = new javax.swing.JComboBox();
        difficult = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        average.setText("Average");
        average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageActionPerformed(evt);
            }
        });

        easy.setText("Easy");
        easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyActionPerformed(evt);
            }
        });

        none.setText("None (Default)");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        definationWord.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        definationWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        definationWord.setText("Word\n");

        answerDefined.setEditable(false);
        answerDefined.setColumns(20);
        answerDefined.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        answerDefined.setLineWrap(true);
        answerDefined.setRows(5);
        answerDefined.setWrapStyleWord(true);
        jScrollPane1.setViewportView(answerDefined);

        showAnswer.setText("Show Answer");
        showAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAnswerActionPerformed(evt);
            }
        });

        dropdownList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In order", "Difficult", "Easy", "Average", "Random" }));
        dropdownList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownListActionPerformed(evt);
            }
        });

        difficult.setText("Difficult");
        difficult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultActionPerformed(evt);
            }
        });

        add.setText("Add Defination");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Convienent Flash Cards!");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Filter:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("2015 Bhargav L K. All Rights Reserved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dropdownList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(add)
                                .addGap(44, 44, 44)
                                .addComponent(showAnswer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(difficult)
                                    .addComponent(average)
                                    .addComponent(easy)
                                    .addComponent(none))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(definationWord, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addComponent(definationWord)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(difficult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(average)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(easy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(none))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropdownList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(showAnswer)
                                .addComponent(add)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageActionPerformed
        // TODO add your handling code here:
        if(average.isSelected())
            w.setIndex(2,k-1);
        w.setAverage(k-1);
    }//GEN-LAST:event_averageActionPerformed

    private void easyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyActionPerformed
        // TODO add your handling code here:
        if(easy.isSelected())
            w.setIndex(1,k-1);
        w.setEasy(k-1);
    }//GEN-LAST:event_easyActionPerformed

    public void setter(int n)
    {
        if(n == 3)
        {
            difficult.setSelected(true);
        }
        else if(n == 2)
        {
            average.setSelected(true);
        }
        else if(n == 1)
        {
            easy.setSelected(true);
        }
    }
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        difficult.setSelected(false);
        average.setSelected(false);
        easy.setSelected(false);
        none.setSelected(true);
        answerDefined.setText("");
        
       if(dropdownList.getSelectedIndex() == 0)
        {
            if(k<w.getCount())
       {
            definationWord.setText(w.wordd(k));
            setter(w.getIndex(k));
       }
        else
       {
            k = 0;
            definationWord.setText(w.wordd(k));
            setter(w.getIndex(k));
       }
       k++;
        }
        else if(dropdownList.getSelectedIndex() == 1)
        {
            if(d<w.getDifficultCount())
            {
                definationWord.setText(w.getDifficult(d));
                d++;
            }
            else
                d=0;
        }
        else if(dropdownList.getSelectedIndex() == 2)
        {
            if(e<w.getEasyCount())
            {
                definationWord.setText(w.getEasy(e));
                e++;
            }
            else
                e=0;
        }
        else if(dropdownList.getSelectedIndex() == 3)
        {
            if(a<w.getAverageCount())
            {
                definationWord.setText(w.getAverage(a));
                a++;
            }
            else
                a=0;
        }
        else
        {
            
            mmm = ran.nextInt(w.getCount());
            System.out.println(w.getCount());
            while(nc.addNumber(mmm,w.getCount()))
            {
                mmm = ran.nextInt(w.getCount());
            }
            definationWord.setText(w.wordd(mmm));
            
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void showAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnswerActionPerformed
        // TODO add your handling code here:
        if(dropdownList.getSelectedIndex() == 0)
        {
        if(k-1<w.getCount())
            answerDefined.setText(w.showDefination(k-1));
        else
            k = 0;
        }
        else if(dropdownList.getSelectedIndex() == 1)
        {
            //System.out.println(w.getDifficultCount());
            if(d-1<w.getDifficultCount())
                answerDefined.setText(w.showDifficultDefination(d-1));
            else
                d=0;
        }
        else if(dropdownList.getSelectedIndex() == 2)
        {
            //System.out.println(w.getEasyCount());
            if(e-1<w.getEasyCount())
                answerDefined.setText(w.showEasyDefination(e-1));
            else
                e=0;
        }
        else if(dropdownList.getSelectedIndex() == 3)
        {
            if(a<w.getAverageCount())
                answerDefined.setText(w.showAverageDefination(a-1));
            else
                a=0;
        }
        else
        {
            answerDefined.setText(w.showDefination(mmm));
        }
    }//GEN-LAST:event_showAnswerActionPerformed

    private void dropdownListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownListActionPerformed
        if(dropdownList.getSelectedItem() == "Difficult")
        {
            difficult.setEnabled(false);
            easy.setEnabled(false);
            none.setEnabled(false);
            average.setEnabled(false);
        }
        else if(dropdownList.getSelectedItem() == "Easy")
        {
            difficult.setEnabled(false);
            easy.setEnabled(false);
            none.setEnabled(false);
            average.setEnabled(false);
        }
        else if(dropdownList.getSelectedItem() == "Average")
        {
            difficult.setEnabled(false);
            easy.setEnabled(false);
            none.setEnabled(false);
            average.setEnabled(false);
        }
        else if(dropdownList.getSelectedItem() == "Random")
        {
            difficult.setEnabled(true);
            easy.setEnabled(true);
            none.setEnabled(true);
            average.setEnabled(true);
        }
        else
        {
            difficult.setEnabled(true);
            easy.setEnabled(true);
            none.setEnabled(true);
            average.setEnabled(true);
        }
        
    }//GEN-LAST:event_dropdownListActionPerformed

    private void difficultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultActionPerformed
        // TODO add your handling code here:
        if(difficult.isSelected())
            w.setIndex(3,k-1);
       w.setDifficult(k-1);
    }//GEN-LAST:event_difficultActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String word = JOptionPane.showInputDialog(rootPane, "Please input a word you want to save?", "WORD", JOptionPane.QUESTION_MESSAGE);
        String defination = JOptionPane.showInputDialog(rootPane, "Please enter the corresponding defination for the word", "DEFINATION", JOptionPane.QUESTION_MESSAGE);
        w.addWord(word, defination);
        choice = JOptionPane.showConfirmDialog(rootPane, "Do you want to save it?","Confirm Dialog",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION)
        {
            save();
        }
    }//GEN-LAST:event_addActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        save();
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneActionPerformed
        // TODO add your handling code here:
        if(none.isSelected())
            w.setIndex(0,k-1);
    }//GEN-LAST:event_noneActionPerformed
    
    public void initial()
    {
        try
             {
                ObjectInputStream readTest= new ObjectInputStream(new FileInputStream("test.ser"));
                words st1= (words) readTest.readObject();
                readTest.close();
                //throw new IOException("File not found\n");
                w=st1;
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(rootPane, e.getMessage());
             }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea answerDefined;
    private javax.swing.JRadioButton average;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel definationWord;
    private javax.swing.JRadioButton difficult;
    private javax.swing.JComboBox dropdownList;
    private javax.swing.JRadioButton easy;
    private static javax.swing.JButton exitButton;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton none;
    private javax.swing.JButton showAnswer;
    // End of variables declaration//GEN-END:variables
}
