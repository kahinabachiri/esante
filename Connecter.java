/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele_bdd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Connecter {
    Connection co;

    public Connecter() {
        
        try {
            //connection au serveur de base de donnée
            
            Class.forName("com.mysql.jdbc.Driver");
            //JOptionPane.showMessageDialog(null, "connection au serveur de base de donnée mysql a été bien réussit");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "echec de connection au serveur de base de donnée "+ex.getMessage());
        }
        
          
        try {
            //connection a la base de donnée
            co=DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root", "");
           // JOptionPane.showMessageDialog(null, "connection à la base de donnée mysql a été bien réussit");
        } catch (SQLException ex) {
            Logger.getLogger(Connecter.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "echec de connection à la base de donnée "+ex.getMessage());
        }
        
    }
    
    //la methode de connection
    public Connection connectbd(){
        
        return co;
    }
    
    public static void main(String[] args) {
        
        Connecter c =new Connecter();
        c.connectbd();
    }
   
    
    
  
}
