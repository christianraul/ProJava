package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Tadeo
 */
public class Metlibro extends Conexion {

    public boolean guardar(Deflibro li) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO reg_libro(idlib, codlibro, titlibro, aulibro, fechlibro) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, li.getCodigo());
            ps.setString(2, li.getTitulo());
            ps.setString(3, li.getAutor());
            ps.setString(4, li.getFecha());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }
}
