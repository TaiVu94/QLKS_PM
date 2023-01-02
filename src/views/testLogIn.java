/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.sun.jdi.connect.spi.Connection;
import do_an_csdl_hi.ConnectDB;
import java.sql.*;


/**
 *
 * @author DELL
 */
public class testLogIn extends javax.swing.JFrame {

    /**
     * Creates new form testLogIn
     */
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    private String uid;
    private String pwd;
    
    
    public testLogIn() {
        initComponents();
    }

    public testLogIn(String uid, String pwd){
        initComponents();
        this.uid = uid;
        this.pwd = pwd;
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taikhoan = new javax.swing.JLabel();
        matkhau = new javax.swing.JLabel();
        quyen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taikhoan.setText("User");
        getContentPane().add(taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 55, 410, 30));

        matkhau.setText("Password");
        getContentPane().add(matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 103, 410, 34));

        quyen.setText("TungSon");
        getContentPane().add(quyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 155, 380, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel matkhau;
    private javax.swing.JLabel quyen;
    private javax.swing.JLabel taikhoan;
    // End of variables declaration//GEN-END:variables
}
