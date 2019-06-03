/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele_bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class ConnectPatient {
 public    Connecter c=new Connecter();
    public PreparedStatement ps;
    public ResultSet rs;
    public ConnectPatient() {
        
        
        
         try {
             ps=c.connectbd().prepareStatement("select * from patient");
             rs=ps.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(ConnectPatient.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    
}
