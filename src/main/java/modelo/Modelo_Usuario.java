package modelo;


import com.toedter.calendar.JDateChooser;
import controlador.Conexion;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Modelo_Usuario {

   
    private int idUsu, idsex, idcarg;
    private String nom, telef, corr, direc, logi, clav;
    private Date fech_naci;

  
    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public int getIdsex() {
        return idsex;
    }

    public void setIdsex(int idsex) {
        this.idsex = idsex;
    }

    public int getIdcarg() {
        return idcarg;
    }

    public void setIdcarg(int idcarg) {
        this.idcarg = idcarg;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getLogi() {
        return logi;
    }

    public void setLogi(String logi) {
        this.logi = logi;
    }

    public String getClav() {
        return clav;
    }

    public void setClav(String clav) {
        this.clav = clav;
    }

    public Date getFech_naci() {
        return fech_naci;
    }

    public void setFech_naci(Date fech_naci) {
        this.fech_naci = fech_naci;
    }

    public Map<String, Integer> llenarCombo(String valor) {
         Conexion conect = new Conexion();
         Connection cn = conect.iniciarConexion();

        String sgl = "SELECT * FROM mostrar_"+valor;

        Map<String, Integer> llenar_combo = new HashMap<>();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sgl);
            while (rs.next()) {
                llenar_combo.put(rs.getString(2), rs.getInt(1));
            }
        } catch (SQLException y) {

            y.printStackTrace();

        }
        return llenar_combo;
    }

    public void insertarUsuarios() {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();
        String sql = "call into_usuario(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, getIdUsu());
            ps.setString(2, getNom());
            ps.setString(3, getTelef());
            ps.setString(4, getCorr());
            ps.setString(5, getDirec());
            ps.setInt(6, getIdsex());
            ps.setInt(7, getIdcarg());
            ps.setString(8, getLogi());
            ps.setString(9, getClav());
            ps.setDate(10, (java.sql.Date) getFech_naci());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de almacenamineto", "Registro", idsex);
            cn.close();
            JOptionPane.showMessageDialog(null, "Error", "Error", idsex);
            cn.close();
        } catch (SQLException y) {
            System.out.println("Error");

        }
        conect.cerraConexion();
    }
   
public void limpiar (Component[]panel){
    for (Object control : panel){
        if (control instanceof JTextField){
            ((JTextField)control).setText("");
            
        }
        if (control instanceof JComboBox){
            ((JComboBox)control).setSelectedItem("Seleccionar...");
        }
        if (control instanceof JDateChooser){
            ((JDateChooser)control).setDate(null);
        }
    }

}
}

