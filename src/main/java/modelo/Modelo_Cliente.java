
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;



public class Modelo_Cliente {
     private int idClien, idsex ;
    private String nom, tel, corr ;
    private Date fech_naci;

    public int getIdClien() {
        return idClien;
    }

    public void setIdClien(int idClien) {
        this.idClien = idClien;
    }

    public int getIdsex() {
        return idsex;
    }

    public void setIdsex(int idsex) {
        this.idsex = idsex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
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
     

    public void insertarCliente() {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();
        String sql = "call into_clien(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, getIdsex());
            ps.setString(2, getNom());
            ps.setString(3, getTel());
            ps.setString(4, getCorr());
            ps.setInt(5, getIdsex());
            ps.setDate(6, (java.sql.Date) getFech_naci());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de almacenamineto", "Registro", idsex);
            cn.close();
            

        } catch (SQLException y) {
           JOptionPane.showMessageDialog(null, "Error", "Error", idsex);

        }
        conect.cerraConexion();
    }    

}
