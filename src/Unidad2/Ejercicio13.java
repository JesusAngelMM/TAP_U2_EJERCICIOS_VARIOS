/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Unidad2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio13
     */
    public Ejercicio13() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/icono1.png"));
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/icono2.png"));
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/icono3.png"));
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagenes/icono4.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraHerramientas = new javax.swing.JToolBar();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setRollover(true);

        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1.png"))); // NOI18N
        btnUno.setFocusable(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnUno);

        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono2.png"))); // NOI18N
        btnDos.setFocusable(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnDos);

        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono3.png"))); // NOI18N
        btnTres.setFocusable(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnTres);

        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N
        btnCuatro.setFocusable(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCuatro);

        jLabel1.setText("Martínez Mendoza Jesús Ángel");

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Activaste el botón Uno");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Activaste el botón Cuatro");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Activaste el botón Dos");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Activaste el botón Tres");
    }//GEN-LAST:event_btnTresActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
