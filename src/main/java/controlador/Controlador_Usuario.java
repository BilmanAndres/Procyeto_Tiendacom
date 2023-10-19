
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo_Usuario;
import vista.Principal;
import vista.Usuarios;


public class Controlador_Usuario implements ActionListener {

      Usuarios usu = new Usuarios();
      Principal pri = new Principal();
      Modelo_Usuario mode_usu = new Modelo_Usuario();
      
 
    
    public void controUsuario(){
      
              usu.addWindowListener(new WindowAdapter(){
                  public void windowClosed(WindowEvent y) {
                      pri.setVisible(true);
                  }
              });
              
              pri.setVisible(false);
              usu.setLocationRelativeTo(null);
              usu.setVisible(true);
              
                 usu.getjCbBoxselec_sexo().addItem("Seleccione...");
                 Map<String,Integer>dato = mode_usu.llenarCombo("sexo");
                    for(String sexo:dato.keySet()){
                         usu.getjCbBoxselec_sexo().addItem(sexo);
             }
            
                usu.getjComboBoxcargo().addItem("Seleccione...");
                Map<String,Integer>datos = mode_usu.llenarCombo("cargo");
                    for(String rol:datos.keySet()){
                 usu.getjComboBoxcargo().addItem(rol);
          } 
    
    }
 public Controlador_Usuario() {
     usu.getjButtoguardar().addActionListener(this);
      usu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
 
    @Override
    public void actionPerformed(ActionEvent y) {
     if (y.getSource().equals(usu.getjButtoguardar())){
         if (((usu.getjTextinsert_ususario().getText().isEmpty())||(usu.getjTextisert_nombre().getText().isEmpty())||
                 (usu.getjTextinsert_telefono().getText().isEmpty())||
                 (usu.getjCbBoxselec_sexo().getSelectedItem().equals("Seleccione..."))||
                 (usu.getjTextinser_direccion().getText().isEmpty())||
                 (usu.getjDateChooserFecha_nacimiento().getDate()== null)||
                 (usu.getjComboBoxcargo().getSelectedItem().equals("Seleccione...")||
                 (usu. getjTextinsert_login().getText().isEmpty())||
                 (usu.getjTextinsert_correo().getText().isEmpty())||
                 (usu.getjPasinsert_clave().getPassword() == null) ) )){
                 JOptionPane.showMessageDialog(null, "FALTA INFORMACION EN LOS CAMPOS");
         //}
     } else {
         JOptionPane.showMessageDialog(null, "EXITO");
         String valorSexo = usu.getjCbBoxselec_sexo().getSelectedItem().toString();
         String valorCargo = usu.getjComboBoxcargo().getSelectedItem().toString();
         
         int sexo = mode_usu.llenarCombo("sexo").get(valorSexo);
         int cargo = mode_usu.llenarCombo("cargo").get(valorCargo);

        char[] contra = usu.getjPasinsert_clave().getPassword();
        String contrasena = String.valueOf(contra);
        
        mode_usu.setIdUsu( Integer.parseInt(usu.getjTextinsert_ususario().getText()));
        mode_usu.setNom(usu.getjTextisert_nombre().getText());
        mode_usu.setTelef(usu.getjTextinsert_telefono().getText());
        mode_usu.setCorr(usu.getjTextinsert_correo().getText());
        mode_usu.setDirec(usu.getjTextinser_direccion().getText());
        mode_usu.setIdsex(sexo);
        mode_usu.setIdcarg(cargo);//setIdcarg(idcarg);
        mode_usu.setLogi(usu.getjTextinsert_login().getText());
        mode_usu.setClav(contrasena);
        mode_usu.setFech_naci(fecha);
        
            
     }  
       
    }
    } //(usu.getjPasinsert_clave().getPassword() == null) ) )){
}
