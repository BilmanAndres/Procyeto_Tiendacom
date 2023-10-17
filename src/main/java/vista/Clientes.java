/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Clientes extends javax.swing.JFrame {

   
    public Clientes() {
        initComponents();
    }

    public JButton getjButtguardar_cliente() {
        return jButtguardar_cliente;
    }

    public void setjButtguardar_cliente(JButton jButtguardar_cliente) {
        this.jButtguardar_cliente = jButtguardar_cliente;
    }

    public JComboBox<String> getjCoboxsexo() {
        return JCoboxsexo;
    }

    public void setjCoboxsexo(JComboBox<String> jCoboxsexo) {
        this.JCoboxsexo = jCoboxsexo;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JTextField getjTextcilente() {
        return jTextcilente;
    }

    public void setjTextcilente(JTextField jTextcilente) {
        this.jTextcilente = jTextcilente;
    }

    public JTextField getjTextcorreo() {
        return jTextcorreo;
    }

    public void setjTextcorreo(JTextField jTextcorreo) {
        this.jTextcorreo = jTextcorreo;
    }

    public JTextField getjTextelefono() {
        return jTextelefono;
    }

    public void setjTextelefono(JTextField jTextelefono) {
        this.jTextelefono = jTextelefono;
    }

    public JTextField getjTextnombre() {
        return jTextnombre;
    }

    public void setjTextnombre(JTextField jTextnombre) {
        this.jTextnombre = jTextnombre;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabcliente = new javax.swing.JLabel();
        jTextcilente = new javax.swing.JTextField();
        jLabnombre = new javax.swing.JLabel();
        jLabtelefono = new javax.swing.JLabel();
        jLabcorreo = new javax.swing.JLabel();
        jLabsexo = new javax.swing.JLabel();
        jLabfecha_nacimento = new javax.swing.JLabel();
        jTextnombre = new javax.swing.JTextField();
        jTextelefono = new javax.swing.JTextField();
        jTextcorreo = new javax.swing.JTextField();
        JCoboxsexo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtguardar_cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));
        jPanel1.setForeground(new java.awt.Color(204, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("NUEVO CLIENTE");

        jLabcliente.setText("IdCliente");

        jTextcilente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcilenteActionPerformed(evt);
            }
        });

        jLabnombre.setText("Nombre");

        jLabtelefono.setText("Telefono");

        jLabcorreo.setText("Correo");

        jLabsexo.setText("sexo");

        jLabfecha_nacimento.setText("fecha_nacimineto");

        JCoboxsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCoboxsexoActionPerformed(evt);
            }
        });

        jButtguardar_cliente.setText("GUARDAR");
        jButtguardar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtguardar_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabnombre)
                            .addComponent(jLabcliente)
                            .addComponent(jLabtelefono)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabsexo)
                                .addComponent(jLabcorreo)))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextcilente, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jTextnombre)
                            .addComponent(jTextelefono)
                            .addComponent(jTextcorreo)
                            .addComponent(JCoboxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabfecha_nacimento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtguardar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabcliente)
                    .addComponent(jTextcilente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabnombre)
                    .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabtelefono)
                    .addComponent(jTextelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabcorreo)
                    .addComponent(jTextcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabsexo)
                    .addComponent(JCoboxsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabfecha_nacimento)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtguardar_cliente)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextcilenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcilenteActionPerformed
        
    }//GEN-LAST:event_jTextcilenteActionPerformed

    private void jButtguardar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtguardar_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtguardar_clienteActionPerformed

    private void JCoboxsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCoboxsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCoboxsexoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCoboxsexo;
    private javax.swing.JButton jButtguardar_cliente;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabcliente;
    private javax.swing.JLabel jLabcorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabfecha_nacimento;
    private javax.swing.JLabel jLabnombre;
    private javax.swing.JLabel jLabsexo;
    private javax.swing.JLabel jLabtelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextcilente;
    private javax.swing.JTextField jTextcorreo;
    private javax.swing.JTextField jTextelefono;
    private javax.swing.JTextField jTextnombre;
    // End of variables declaration//GEN-END:variables

    public Object getJCoboxsexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjButtonuevo_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object JCoboxsexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object jDateChooser1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
