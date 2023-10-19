
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo_Cliente;

import vista.Clientes;
import vista.Principal;

public class Controlador_Cliente implements ActionListener {

    Clientes cli = new Clientes();
    Principal pri = new Principal();
    Modelo_Cliente mode_cli = new Modelo_Cliente();

    public Controlador_Cliente() {
        cli.getjButtguardar_cliente().addActionListener(this);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    
    public void Contr_clien(){
    
       
        cli.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent y) {
             Controlador_Principal con_pri = new Controlador_Principal(); 
             con_pri.vista();
            }
        });
        
        
            
        
    }

    public void controCliente() {
        

        pri.setVisible(false);
        cli.setLocationRelativeTo(null);
        cli.setVisible(true);

        cli.getjCoboxsexo().addItem("Seleccione...");
        Map<String, Integer> dato = mode_cli.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            cli.getjCoboxsexo().addItem(sexo);

        }

    }

    @Override
    public void actionPerformed(ActionEvent y) {
        if (y.getSource().equals(cli.getjButtguardar_cliente())) {
            if (((cli.getjTextcilente().getText().isEmpty()) || (cli.getjTextnombre().getText().isEmpty())
                    || (cli.getjTextelefono().getText().isEmpty())
                    || (cli.getjTextcorreo().getText().isEmpty()
                    || (cli.getjCoboxsexo().getSelectedItem().equals("Seleccione..."))
                    || (cli.getjDateChooser1().getDate() == null)))) {
                JOptionPane.showMessageDialog(null, "FALTA INFORMACION EN LOS CAMPOS");
            //}
        } else {

            JOptionPane.showMessageDialog(null, "!!EXITO!!");
            String valorSexo = cli.getjCoboxsexo().getSelectedItem().toString();
            int sexo = mode_cli.llenarCombo("sexo").get(valorSexo);

            java.util.Date fec = cli.getjDateChooser1().getDate();
            long fe = fec.getTime();
            java.sql.Date fecha = new Date (fe);
            
            mode_cli.setIdClien(Integer.parseInt(cli.getjTextcilente().getText()));
            mode_cli.setNom(cli.getjTextnombre().getText());
            mode_cli.setTel(cli.getjTextelefono().getText());
            mode_cli.setCorr(cli.getjTextcorreo().getText());
            mode_cli.setIdsex(sexo);
            mode_cli.setFech_naci(fecha);
            

        }
        }
    }
}
