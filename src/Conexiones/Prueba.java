/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexcastaneda
 */
public class Prueba {

    public static void main(String[] args) throws SQLException {
        Conexion x = new Conexion();
        ResultSet re = x.getStm().executeQuery("SELECT * FROM Usuario WHERE id=1");
        String n1 = " ", usu = " ", idcli = " ";
        while (re.next()) {//mientras tenga algo que imprimir

            n1 = re.getString("id");
            usu = re.getString("Name");
            

        }
        System.out.println(usu);
       
        String u="Jesus",pa="1234";
        ResultSet re1= x.getStm().executeQuery("SELECT id,Name,Pass FROM Usuario WHERE Name=12345");
            String n11 = " ",usu1 = " ",pass1=" ";
            while(re1.next()){//mientras tenga algo que imprimir
               
                n11=re1.getString("id");
                usu1=re1.getString("Name");
                pass1=re1.getString("Pass");
                
                
            }
            System.out.println(pass1);
           String query = "SELECT * FROM Usuario WHERE Name=?";
           PreparedStatement preparedStmt = x.getCo().prepareStatement(query);
           preparedStmt.setString(1, "Jesus");
          ResultSet r= preparedStmt.executeQuery();
          while(r.next()){
                
               
                pass1=r.getString("Pass"); 
          }
            System.out.println(pass1);
        }

}
