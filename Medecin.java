/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Medecin extends javax.swing.JFrame {

   String ch="BIENVENUE DANS L'ESPACE MEDECIN    ";
   
    public Medecin() {
        initComponents();
        setLocationRelativeTo(this);
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                while (true) {   
                    char c = ch.charAt(0);
                    String  s =ch.substring(1);
                    ch=s+c;
                    ltitre.setText(ch);
                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        
                    }
                    
                }
            }
        }).start();
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bhopitalJ = new javax.swing.JButton();
        bdemande = new javax.swing.JButton();
        bficheSortie = new javax.swing.JButton();
        bdeclarationD = new javax.swing.JButton();
        ltitre = new javax.swing.JLabel();
        bannuler = new javax.swing.JButton();
        lfont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bhopitalJ.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bhopitalJ.setText("Fiche navette Hopital du jour");
        getContentPane().add(bhopitalJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 130, 270, 60));

        bdemande.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bdemande.setText("Demande d'hospitalisation");
        getContentPane().add(bdemande, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 260, 60));

        bficheSortie.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bficheSortie.setText("Fiche navette de Sortie");
        getContentPane().add(bficheSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 260, 60));

        bdeclarationD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bdeclarationD.setText("Declaration de Décés");
        getContentPane().add(bdeclarationD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 260, 60));

        ltitre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ltitre.setForeground(new java.awt.Color(0, 51, 204));
        ltitre.setText("                 BIENVENUE  DANS  L'ESPACE   MEDECIN");
        getContentPane().add(ltitre, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 680, 70));

        bannuler.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bannuler.setText("Annuler");
        bannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bannulerActionPerformed(evt);
            }
        });
        getContentPane().add(bannuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 443, -1, 30));

        lfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IhmImage/medcinfond.jpg"))); // NOI18N
        getContentPane().add(lfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bannulerActionPerformed
    
       Authentification au=new Authentification();
       au.setVisible(true);
    }//GEN-LAST:event_bannulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medecin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bannuler;
    private javax.swing.JButton bdeclarationD;
    private javax.swing.JButton bdemande;
    private javax.swing.JButton bficheSortie;
    private javax.swing.JButton bhopitalJ;
    private javax.swing.JLabel lfont;
    private javax.swing.JLabel ltitre;
    // End of variables declaration//GEN-END:variables
}
