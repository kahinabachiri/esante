/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Acer
 */
public class Acceuil extends javax.swing.JFrame {

   String ch="BIENVENUE DANS NOTRE APPLICATION SantéDZ      ";
   
    public Acceuil() {
        initComponents();
        setLocationRelativeTo(this);
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                while (true) {   
                    char c=ch.charAt(0);
                    String s =ch.substring(1);
                    ch=s+c;
                    bienvenue.setText(ch);
                    
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
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

        bienvenue = new javax.swing.JLabel();
        lfond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenue.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bienvenue.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(bienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 50));

        lfond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IhmImage/Acceuil.jpg"))); // NOI18N
        getContentPane().add(lfond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenue;
    private javax.swing.JLabel lfond;
    // End of variables declaration//GEN-END:variables
}
