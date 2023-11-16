/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dataBase. conexion;
import java.sql.Connection;
import java.sql.ResultSet;

public class MetodosUsuario {
 private Connection con;
int id=0;
String nombre, correo,usuario, password;
conexion conex=new Conexion ();
Preparedstatement stmt;
ResultSet rs;  

public void insertar (String nombre, String correo, String usuario, String password) (
this.nombre=nombre;
this.correo=correo;
this.usuario=usuario;
this.password=password;
try(
con=conex.getConexion ();
stmt= con.prepareStatement ( sq1: "insert into usuarios (nombre, correo, usuario, contrasenia) values (?,?,?,?)");
stmt. setString ( parameterIndex: 1, x: nombre);
stmt. setString ( parameterIndex: 2, x: correo);
stmt. setString ( parameterIndex: 3, x: usuario);
stmt. setString ( parameterIndex: 4, ×: password);
stmt.executeUpdate ();
JOptionPane. showMessageDialog ( parentComponent: null, message: "Se han insertado los datos");
}catch (SOLException e) {
JOptionPane.showMessageDialog(parentComponent:null,"Errordeconexión:"+e.getMessage());
   }
}

/**s
 *
 * @author rafae
 */
public class MetodosUsuario {
    
}
