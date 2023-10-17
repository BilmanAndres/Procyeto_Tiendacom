
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo_Proveedor;
import vista.Principal;
import vista.Proveedores;


public class Controlador_Provedor implements ActionListener {

    Proveedores pro = new Proveedores();
    Principal pri = new Principal();
    Modelo_Proveedor mod_pro = new Modelo_Proveedor();

    public Controlador_Provedor() {
         pro.getjButtonguardar_Provedores().addActionListener(this);
         pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         //getjButtonguardar_Provedores()
    }
    
    public void Contr_clien() {

        pro.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent y) {
                Controlador_Principal con_pri = new Controlador_Principal();
                con_pri.vista();
            }
        });

    }
    
    
     public void controCliente() {
        

        pri.setVisible(false);
        pro.setLocationRelativeTo(null);
        pro.setVisible(true);

        pro.getJCboxsexo_pro().addItem("Seleccione...");
        Map<String, Integer> dato = mod_pro.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            pro.getJCboxsexo_pro().addItem(sexo);

        }

    }

    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent y) {
         if (y.getSource().equals(pro.getjButtonguardar_Provedores())) {
            if (((pro.getjTxtinserIdprovedor().getText().isEmpty()) || (pro.getjTxtinsertipo_docu().getText().isEmpty())
                    || (pro.getjTxtinserNombre().getText().isEmpty())
                    ||(pro.getJCboxsexo_pro().getSelectedItem().equals("Seleccione..."))
                    ||(pro.getjTxtinserCorreo().getText().isEmpty())
                    ||(pro.getjTxtinserTelefono().getText().isEmpty())
                    ||(pro. getjTxtinserDirecc().getText().isEmpty())
                    ||(pro. getjTxtinsertipo_docu().getText().isEmpty()))){
                JOptionPane.showMessageDialog(null, "FALTA INFORMACION EN LOS CAMPOS");
            //}
        } else {

            JOptionPane.showMessageDialog(null, "!!EXITO!!");
            String valorSexo = pro.getJCboxsexo_pro().getSelectedItem().toString();
            int sexo = mod_pro.llenarCombo("sexo").get(valorSexo);

        }
        }
       
    }
    
}
