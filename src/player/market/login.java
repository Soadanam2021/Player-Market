/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package player.market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        Playrole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Logbut = new javax.swing.JButton();
        Clearbut = new javax.swing.JButton();
        Uid = new javax.swing.JTextField();
        Clubregister = new javax.swing.JLabel();
        Upassward = new javax.swing.JPasswordField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 51));

        Playrole.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Playrole.setForeground(new java.awt.Color(255, 153, 0));
        Playrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PlayerSell", "PlayerBuy" }));
        Playrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayroleActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText(" Select Role");

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("User ID");

        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("  Passward");

        jLabel5.setBackground(new java.awt.Color(204, 51, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Football Player Transfer Market");

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\player market\\download.png")); // NOI18N
        jLabel6.setText("jLabel3");

        Logbut.setText("Login");
        Logbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogbutMouseClicked(evt);
            }
        });

        Clearbut.setText("Clear");
        Clearbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbutMouseClicked(evt);
            }
        });
        Clearbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbutActionPerformed(evt);
            }
        });

        Uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UidActionPerformed(evt);
            }
        });

        Clubregister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Clubregister.setText("New Club to join? Register to click ");
        Clubregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClubregisterMouseClicked(evt);
            }
        });

        Upassward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpasswardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(Logbut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clearbut)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Playrole, 0, 221, Short.MAX_VALUE)
                                    .addComponent(Uid, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(Upassward)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(Clubregister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Playrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Upassward)
                        .addGap(11, 11, 11)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logbut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clearbut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Clubregister)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayroleActionPerformed
   Connection Con = null;
    Statement St = null;
    ResultSet Rs =null;
    private void LogbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogbutMouseClicked
        if(Playrole.getSelectedItem().toString().equals("PlayerBuy"))
        {
        String Query = "select * from USER1.SELLTABLE where CLUBNAME= '"+Uid.getText()+"' and CLUBPASS= '"+Upassward.getText()+"'";
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Player","USER1","1234");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                new Sellpoint().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong Clubid or Passward");
            }
            
            
            
        } catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        else{
             if(Playrole.getSelectedItem().toString().equals("PlayerSell"))
        {
        String Query = "select * from USER1.SELLTABLE where CLUBNAME= '"+Uid.getText()+"' and CLUBPASS= '"+Upassward.getText()+"'";
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Player","USER1","1234");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                new players().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong Clubid or Passward");
            }
            
            
            
        } catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        }
            
        }
    }//GEN-LAST:event_LogbutMouseClicked

    private void UidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UidActionPerformed

    private void ClubregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubregisterMouseClicked
        new sellplayers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClubregisterMouseClicked

    private void ClearbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbutMouseClicked
        Uid.setText("");
        Upassward.setText("");
   
    }//GEN-LAST:event_ClearbutMouseClicked

    private void UpasswardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpasswardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpasswardActionPerformed

    private void ClearbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbutActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbut;
    private javax.swing.JLabel Clubregister;
    private javax.swing.JButton Logbut;
    private javax.swing.JComboBox<String> Playrole;
    private javax.swing.JTextField Uid;
    private javax.swing.JPasswordField Upassward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
