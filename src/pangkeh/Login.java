/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkeh;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author citra-user
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtUserNameLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbUserLogin = new javax.swing.JComboBox<>();
        txtPasswordLogin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(865, 545));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 330, 130, 39);
        getContentPane().add(txtUserNameLogin);
        txtUserNameLogin.setBounds(390, 150, 180, 30);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 140, 150, 50);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 200, 130, 30);

        cmbUserLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "Pegawai", "Owner", " " }));
        cmbUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserLoginActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUserLogin);
        cmbUserLogin.setBounds(390, 260, 180, 20);
        getContentPane().add(txtPasswordLogin);
        txtPasswordLogin.setBounds(390, 210, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/login.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 860, 470);

        jPanel1.setAlignmentX(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username,password,user;
        int x;
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from hakakses where username='"+txtUserNameLogin.getText()+"' and "
                    + "password ='"+txtPasswordLogin.getText()+"' and user='"
                    +cmbUserLogin.getSelectedItem().toString()+"'";
            ResultSet  rs = statement.executeQuery(sql);
            int baris=0;
            while(rs.next()){
                baris=rs.getRow();
            }
            if (baris==1 && cmbUserLogin.getSelectedItem().toString().equals("Pegawai")){
                JOptionPane.showMessageDialog(null, "Login Berhasi Sebagai Pegawai");
                    this.dispose();
                    Content c = new Content();
                    c.setVisible(true);
                    c.setTxtNamaUSerLogin(txtUserNameLogin.getText());
                    c.setPegawai(jPanel1, false);
                    c.setBarang(jPanel1, false);
                    c.setJasaDanBarang(jPanel1, false);
                    c.setJasa(jPanel1, false);
                    c.setHakAkses(jPanel1, false);
            }else if(baris==1 && cmbUserLogin.getSelectedItem().toString().equals("ADMIN")){
                    JOptionPane.showMessageDialog(null, "Login Berhasi Sebagai Admin");
                    this.dispose();
                    Content c = new Content();
                    c.setVisible(true);
                    c.setTxtNamaUSerLogin(txtUserNameLogin.getText());
            }else if(baris==1 && cmbUserLogin.getSelectedItem().toString().equals("Owner")){
                    JOptionPane.showMessageDialog(null, "Login Berhasi Sebagai Owner");
                    this.dispose();
                    Content c = new Content();
                    c.setVisible(true);
                    c.setMember(jPanel1, false);
                    c.setHakAkses(jPanel1, false);
                    c.setTxtNamaUSerLogin(txtUserNameLogin.getText());
            }else {
                JOptionPane.showMessageDialog(null, "Username /Password anda salah");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbUserLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUserNameLogin;
    // End of variables declaration//GEN-END:variables
}
