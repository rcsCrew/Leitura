package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
  public Connection conectaDB(){
    Connection Conn = null;

    try {
      String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=" ;
      Conn = DriverManager.getConnection(url);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "ocorreu um erro!", 0);
    }
    return Conn;
  }
}
