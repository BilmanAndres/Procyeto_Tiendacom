/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
    }

    public JTextField getjTxtinserDirecc() {
        return jTxtinserDirecc;
    }

    public void setjTxtinserDirecc(JTextField jTxtinserDirecc) {
        this.jTxtinserDirecc = jTxtinserDirecc;
    }

    public JComboBox<String> getJCboxsexo_pro() {
        return JCboxsexo_pro;
    }

    public void setJCboxsexo_pro(JComboBox<String> JCboxsexo_pro) {
        this.JCboxsexo_pro = JCboxsexo_pro;
    }

    public JButton getjButtonguardar_Provedores() {
        return jButtonguardar_Provedores;
    }

    public void setjButtonguardar_Provedores(JButton jButtonguardar_Provedores) {
        this.jButtonguardar_Provedores = jButtonguardar_Provedores;
    }

    public JComboBox<String> getjComboBoxtipo_docume() {
        return jComboBoxtipo_docume;
    }

    public void setjComboBoxtipo_docume(JComboBox<String> jComboBoxtipo_docume) {
        this.jComboBoxtipo_docume = jComboBoxtipo_docume;
    }

    public JComboBox<String> getjComboBoxtipo_persona() {
        return jComboBoxtipo_persona;
    }

    public void setjComboBoxtipo_persona(JComboBox<String> jComboBoxtipo_persona) {
        this.jComboBoxtipo_persona = jComboBoxtipo_persona;
    }

    public JTextField getjTxtinserCorreo() {
        return jTxtinserCorreo;
    }

    public void setjTxtinserCorreo(JTextField jTxtinserCorreo) {
        this.jTxtinserCorreo = jTxtinserCorreo;
    }

    public JTextField getjTxtinserIdprovedor() {
        return jTxtinserIdprovedor;
    }

    public void setjTxtinserIdprovedor(JTextField jTxtinserIdprovedor) {
        this.jTxtinserIdprovedor = jTxtinserIdprovedor;
    }

    public JTextField getjTxtinserNombre() {
        return jTxtinserNombre;
    }

    public void setjTxtinserNombre(JTextField jTxtinserNombre) {
        this.jTxtinserNombre = jTxtinserNombre;
    }

    public JTextField getjTxtinserTelefono() {
        return jTxtinserTelefono;
    }

    public void setjTxtinserTelefono(JTextField jTxtinserTelefono) {
        this.jTxtinserTelefono = jTxtinserTelefono;
    }

    public JTextField getjTxtinsertipo_docu() {
        return jTxtinsertipo_docu;
    }

    public void setjTxtinsertipo_docu(JTextField jTxtinsertipo_docu) {
        this.jTxtinsertipo_docu = jTxtinsertipo_docu;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLbidproveedor = new javax.swing.JLabel();
        jTxtinserIdprovedor = new javax.swing.JTextField();
        jLbinserTipo_docu = new javax.swing.JLabel();
        jTxtinsertipo_docu = new javax.swing.JTextField();
        jLblinserNombre = new javax.swing.JLabel();
        jTxtinserNombre = new javax.swing.JTextField();
        jLblinserSexo = new javax.swing.JLabel();
        JCboxsexo_pro = new javax.swing.JComboBox<>();
        jLblcorreo = new javax.swing.JLabel();
        jTxtinserCorreo = new javax.swing.JTextField();
        jLbltelefono = new javax.swing.JLabel();
        jTxtinserTelefono = new javax.swing.JTextField();
        jLblinserTipodocu = new javax.swing.JLabel();
        jComboBoxtipo_docume = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxtipo_persona = new javax.swing.JComboBox<>();
        jButtonguardar_Provedores = new javax.swing.JButton();
        jLbldirec_pro = new javax.swing.JLabel();
        jTxtinserDirecc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("NUEVO PROVEEDOR");

        jLbidproveedor.setText("Idproveedor");

        jLbinserTipo_docu.setText("Tipo de Documento");

        jTxtinsertipo_docu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtinsertipo_docuActionPerformed(evt);
            }
        });

        jLblinserNombre.setText("Nombre");

        jTxtinserNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtinserNombreActionPerformed(evt);
            }
        });

        jLblinserSexo.setText("Sexo");

        JCboxsexo_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCboxsexo_proActionPerformed(evt);
            }
        });

        jLblcorreo.setText("Correo");

        jTxtinserCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtinserCorreoActionPerformed(evt);
            }
        });

        jLbltelefono.setText("Telefono");

        jTxtinserTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtinserTelefonoActionPerformed(evt);
            }
        });

        jLblinserTipodocu.setText("Tipo de Documento");

        jComboBoxtipo_docume.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Cedula", "Targeta", "Pasaporte" }));

        jLabel2.setText("TIipo de Persona");

        jComboBoxtipo_persona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar:", "Natural", "Juridica" }));

        jButtonguardar_Provedores.setText("Guardar");

        jLbldirec_pro.setText("Dirección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLbidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblinserSexo)
                                    .addComponent(jLblinserNombre)
                                    .addComponent(jLblcorreo)
                                    .addComponent(jLbltelefono)
                                    .addComponent(jLbldirec_pro)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblinserTipodocu)
                                    .addComponent(jLbinserTipo_docu))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtinserIdprovedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jTxtinsertipo_docu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtinserNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCboxsexo_pro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxtipo_docume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtinserTelefono)
                                    .addComponent(jTxtinserCorreo)
                                    .addComponent(jComboBoxtipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtinserDirecc, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButtonguardar_Provedores)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jLbidproveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jTxtinserIdprovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLbinserTipo_docu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTxtinsertipo_docu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblinserNombre)
                    .addComponent(jTxtinserNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblinserSexo)
                    .addComponent(JCboxsexo_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblcorreo)
                    .addComponent(jTxtinserCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbltelefono)
                    .addComponent(jTxtinserTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLbldirec_pro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtinserDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblinserTipodocu)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxtipo_docume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxtipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButtonguardar_Provedores)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtinsertipo_docuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtinsertipo_docuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtinsertipo_docuActionPerformed

    private void jTxtinserNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtinserNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtinserNombreActionPerformed

    private void JCboxsexo_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCboxsexo_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCboxsexo_proActionPerformed

    private void jTxtinserCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtinserCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtinserCorreoActionPerformed

    private void jTxtinserTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtinserTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtinserTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCboxsexo_pro;
    private javax.swing.JButton jButtonguardar_Provedores;
    private javax.swing.JComboBox<String> jCbBoxselec_sexo;
    private javax.swing.JComboBox<String> jCbBoxselec_sexo1;
    private javax.swing.JComboBox<String> jCbBoxselec_sexo2;
    private javax.swing.JComboBox<String> jComboBoxtipo_docume;
    private javax.swing.JComboBox<String> jComboBoxtipo_persona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbidproveedor;
    private javax.swing.JLabel jLbinserTipo_docu;
    private javax.swing.JLabel jLblcorreo;
    private javax.swing.JLabel jLbldirec_pro;
    private javax.swing.JLabel jLblinserNombre;
    private javax.swing.JLabel jLblinserSexo;
    private javax.swing.JLabel jLblinserTipodocu;
    private javax.swing.JLabel jLbltelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtinserCorreo;
    private javax.swing.JTextField jTxtinserDirecc;
    private javax.swing.JTextField jTxtinserIdprovedor;
    private javax.swing.JTextField jTxtinserNombre;
    private javax.swing.JTextField jTxtinserTelefono;
    private javax.swing.JTextField jTxtinsertipo_docu;
    // End of variables declaration//GEN-END:variables

    public Object getjBtngardar_proveedorespr() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjButtonNuevo1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
