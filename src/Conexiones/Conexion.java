/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

/**
 *
 * @author alexcastaneda
 */
import java.sql.*;
public class Conexion {
 Connection co;
 Statement stm;
 public Conexion(){
     try{
          Class.forName("com.mysql.jdbc.Driver");
          co= DriverManager.getConnection("jdbc:mysql://localhost/Muebleria?user=root&password=");
          stm=co.createStatement();
     }catch(ClassNotFoundException exc){
         exc.printStackTrace();
     }catch(SQLException e){
         e.printStackTrace();
     }
 }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public Connection getCo() {
        return co;
    }

    public void setCo(Connection co) {
        this.co = co;
    }
    
 
}
