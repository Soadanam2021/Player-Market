package player.market;


import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class sellplayers extends javax.swing.JFrame {

    

    public sellplayers() {
        initComponents();
        SelectClub();
        
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs =null;
    
    public void SelectClub()
    {
        try{
          Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Player","USER1","1234");
             St = Con.createStatement();
             Rs = executeQuery("Select * from USER1.SELLTABLE");
            
             Clubstable.setModel(DbUtils.resultSetToTableModel(Rs));
             
             
             
             
             
            
        }catch(Exception e)
        {
              e.printStackTrace();
        }
          
    
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Clubname = new javax.swing.JTextField();
        Country = new javax.swing.JComboBox<>();
        clubpass = new javax.swing.JTextField();
        clubID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Clubstable = new javax.swing.JTable();
        Addbut = new javax.swing.JButton();
        Cclear = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        jTable4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Country", "Current Club", "End of the deal", "Buyout Clause", "Position"
            }
        ));
        jTable4.setCellSelectionEnabled(true);
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setText(" Club's Profile");

        jLabel8.setText("Country");

        jLabel1.setText("Club's ID ");

        jLabel2.setText("Club Name ");

        Clubname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spain", "Netherland's", "England", "Italy", "Portugal", "France", "Germany", " " }));
        Country.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });

        clubpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clubpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubpassActionPerformed(evt);
            }
        });

        clubID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clubID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        Clubstable.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Clubstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Club's ID", "Club Name", "Password", "Country"
            }
        ));
        Clubstable.setCellSelectionEnabled(true);
        jScrollPane5.setViewportView(Clubstable);

        Addbut.setText("Register");
        Addbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbutMouseClicked(evt);
            }
        });

        Cclear.setText("Clear");
        Cclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CclearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CclearMouseEntered(evt);
            }
        });
        Cclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CclearActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 51, 51));
        Back.setText("Back to Start Page");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clubpass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(Addbut)
                        .addGap(114, 114, 114)
                        .addComponent(Cclear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(Back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clubID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clubname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 516, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cclear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(168, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(clubID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Clubname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(234, 234, 234)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryActionPerformed

    private void clubpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubpassActionPerformed

    private void clubIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubIDActionPerformed

    private void AddbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbutMouseClicked
        
        if(clubID.getText().isEmpty()||Clubname.getText().isEmpty()||clubpass.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
        try{
           
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Player","USER1","1234");
            PreparedStatement add = Con.prepareStatement("Insert into SELLTABLE values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(clubID.getText()));
            add.setString(2,Clubname.getText());
            add.setString(3,clubpass.getText());
            add.setString(4,Country.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Club Added Successfully");
            
        }
        
        catch(Exception e){
            
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddbutMouseClicked

    private void CclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CclearMouseClicked
        clubID.setText("");
        Clubname.setText("");
        clubpass.setText("");
        

    }//GEN-LAST:event_CclearMouseClicked

    private void CclearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CclearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CclearMouseEntered

    private void CclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CclearActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked
    

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
            java.util.logging.Logger.getLogger(sellplayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellplayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellplayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellplayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellplayers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbut;
    private javax.swing.JLabel Back;
    private javax.swing.JButton Cclear;
    private javax.swing.JTextField Clubname;
    private javax.swing.JTable Clubstable;
    private javax.swing.JComboBox<String> Country;
    private javax.swing.JTextField clubID;
    private javax.swing.JTextField clubpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    private ResultSet executeQuery(String select__) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
