/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import mx.datos.Producto;

/**
 *
 * @author juliobitar
 */
public class ProductosDao implements Crud{
    private static final String SQL_INSERT =
            "INSERT INTO productos ("
            + "clave, descripcion, precio, clasificacion, cantidad, min, max"
            + ") VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT =
            "SELECT clave, descripcion, precio, clasificacion "
            + "  FROM productos where clave= ?";
    private static final String SQL_SELECT_All =
            "SELECT clave, descripcion, precio, clasificacion   "
            + "FROM productos";
    private static final String SQL_UPDATE =
            "UPDATE productos SET "
            + "descripcion = ?, precio = ?, clasificacion = ?"
            + " WHERE "
            + "clave = ? ";
    /* SQL to delete data */
    private static final String SQL_DELETE =
            "DELETE FROM productos WHERE "
            + "clave = ?";

   public void create(Producto productos, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, productos.getClave());
            ps.setString(2, productos.getDescripcion());
            ps.setFloat(3, productos.getPrecio());
            ps.setString(4, productos.getClasificacion());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
        
    }
   