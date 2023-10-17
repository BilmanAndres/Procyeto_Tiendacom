/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;

/**
 *
 * @author SENA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JButton getjButtonNuevo1() {
        return jButtonNuevo1;
    }

    public void setjButtonNuevo1(JButton jButtonNuevo1) {
        this.jButtonNuevo1 = jButtonNuevo1;
    }

    public JButton getjButtonNuevo() {
        return jButtonNuevo;
    }

    public void setjButtonNuevo(JButton jButtonNuevo) {
        this.jButtonNuevo = jButtonNuevo;
    }

    public JButton getjButtonuevo2() {
        return jButtonuevo2;
    }

    public void setjButtonuevo2(JButton jButtonuevo2) {
        this.jButtonuevo2 = jButtonuevo2;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbtiendacom = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelusuario = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jPanelprovedores = new javax.swing.JPanel();
        jButtonNuevo1 = new javax.swing.JButton();
        jPanelproducdo = new javax.swing.JPanel();
        jPanelcliente = new javax.swing.JPanel();
        jButtonuevo2 = new javax.swing.JButton();
        jPanelfactura = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        jLbtiendacom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLbtiendacom.setText("TIEMDACOM !!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLbtiendacom)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbtiendacom)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 204));

        jPanelusuario.setBackground(new java.awt.Color(255, 102, 204));

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelusuarioLayout = new javax.swing.GroupLayout(jPanelusuario);
        jPanelusuario.setLayout(jPanelusuarioLayout);
        jPanelusuarioLayout.setHorizontalGroup(
            jPanelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelusuarioLayout.createSequentialGroup()
                .addComponent(jButtonNuevo)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanelusuarioLayout.setVerticalGroup(
            jPanelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelusuarioLayout.createSequentialGroup()
                .addComponent(jButtonNuevo)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuario", jPanelusuario);

        jButtonNuevo1.setText("Nuevo");
        jButtonNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelprovedoresLayout = new javax.swing.GroupLayout(jPanelprovedores);
        jPanelprovedores.setLayout(jPanelprovedoresLayout);
        jPanelprovedoresLayout.setHorizontalGroup(
            jPanelprovedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelprovedoresLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButtonNuevo1)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanelprovedoresLayout.setVerticalGroup(
            jPanelprovedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelprovedoresLayout.createSequentialGroup()
                .addComponent(jButtonNuevo1)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Provedores", jPanelprovedores);

        javax.swing.GroupLayout jPanelproducdoLayout = new javax.swing.GroupLayout(jPanelproducdo);
        jPanelproducdo.setLayout(jPanelproducdoLayout);
        jPanelproducdoLayout.setHorizontalGroup(
            jPanelproducdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelproducdoLayout.setVerticalGroup(
            jPanelproducdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Producto", jPanelproducdo);

        jButtonuevo2.setText("Nuevo");
        jButtonuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuevo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelclienteLayout = new javax.swing.GroupLayout(jPanelcliente);
        jPanelcliente.setLayout(jPanelclienteLayout);
        jPanelclienteLayout.setHorizontalGroup(
            jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelclienteLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jButtonuevo2)
                .addGap(82, 82, 82))
        );
        jPanelclienteLayout.setVerticalGroup(
            jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelclienteLayout.createSequentialGroup()
                .addComponent(jButtonuevo2)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanelcliente);

        javax.swing.GroupLayout jPanelfacturaLayout = new javax.swing.GroupLayout(jPanelfactura);
        jPanelfactura.setLayout(jPanelfacturaLayout);
        jPanelfacturaLayout.setHorizontalGroup(
            jPanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelfacturaLayout.setVerticalGroup(
            jPanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Factura", jPanelfactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevo1ActionPerformed

    private void jButtonuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonuevo2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonNuevo1;
    private javax.swing.JButton jButtonuevo2;
    private javax.swing.JLabel jLbtiendacom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelcliente;
    private javax.swing.JPanel jPanelfactura;
    private javax.swing.JPanel jPanelproducdo;
    private javax.swing.JPanel jPanelprovedores;
    private javax.swing.JPanel jPanelusuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public void getjButtonuevo_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
