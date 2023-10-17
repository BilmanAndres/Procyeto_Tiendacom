
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class Modelo_Proveedor {
    
    private int idpro, tipo_docu, ti_po, idsex;
    private String nom, corr,tele, direc;
    private Date fech_naci;

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public int getTipo_docu() {
        return tipo_docu;
    }

    public void setTipo_docu(int tipo_docu) {
        this.tipo_docu = tipo_docu;
    }

    public int getTi_po() {
        return ti_po;
    }

    public void setTi_po(int ti_po) {
        this.ti_po = ti_po;
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

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
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
     public void insertarProvedor() {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();
        String sql = "call into_clien(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, getIdpro());
            ps.setInt(2, getTipo_docu());
            ps.setString(3, getNom());
            ps.setInt(4, getIdsex());
            ps.setString(5, getCorr());
            ps.setString(6, getTele());
            ps.setString(7, getDirec() );
            ps.setInt(8, getTi_po());
            ps.setDate(9, (java.sql.Date) getFech_naci());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de almacenamineto", "Registro", idsex);
            cn.close();
            

        } catch (SQLException y) {
           JOptionPane.showMessageDialog(null, "Error", "Error", idsex);

        }
        conect.cerraConexion();
    }    

}
