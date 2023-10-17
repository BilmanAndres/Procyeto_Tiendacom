package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Modelo_Usuario;
import vista.Clientes;
import vista.Principal;
import vista.Proveedores;
import vista.Usuarios;

public class Controlador_Principal implements ActionListener {

    Principal pri = new Principal();
    Usuarios usu = new Usuarios();
    Modelo_Usuario mode_usu = new Modelo_Usuario();
    Controlador_Usuario con_usu = new Controlador_Usuario();
    ///
    Clientes cli = new Clientes();
    Controlador_Cliente contr_cli = new Controlador_Cliente();
    ///
    Proveedores pro = new Proveedores();
    Controlador_Provedor con_pro = new Controlador_Provedor();
    
    

    //jButtonuevo_cliente
    public Controlador_Principal() {
        pri.getjButtonNuevo().addActionListener(this);
        pri.getjButtonuevo2().addActionListener(this);
        pri.getjButtonNuevo1().addActionListener(this);
        usu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        //
        
        
    }
   
////jButtonuevo_cliente
    public void vista() {
        pri.setLocationRelativeTo(null);// creando la vista
        pri.setTitle("Iniciar Sesion");
        pri.setVisible(true);// VER LA VISTA
        //
       // cli.setLocationRelativeTo(null);// 
        //cli.setTitle("Iniciar Clientes");
        //cli.setVisible(true);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent y) {

        if (y.getSource().equals(pri.getjButtonNuevo())) {
            pri.setVisible(false);
            con_usu.controUsuario();
        }
        if (y.getSource().equals(pri.getjButtonuevo2())) {
             pri.setVisible(false);
            contr_cli.controCliente();
        }
        if (y.getSource().equals(pri.getjButtonNuevo1())) {
             pri.setVisible(false);
            con_pro.controCliente();
        }
    }

}
