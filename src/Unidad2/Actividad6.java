/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Unidad2;

import java.awt.Dimension;

/**
 *
 * @author Usuario
 */
public class Actividad6 extends javax.swing.JFrame {

    /**
     * Creates new form Actividad6
     */
    public Actividad6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        btnEsquina = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnAgrandar = new javax.swing.JButton();
        btnReducir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setBackground(new java.awt.Color(0, 153, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Jesús Ángel");
        lblNombre.setOpaque(true);

        btnEsquina.setText("Esquina");
        btnEsquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEsquinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEsquinaMouseExited(evt);
            }
        });
        btnEsquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquinaActionPerformed(evt);
            }
        });

        btnCentro.setText("Centro");
        btnCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCentroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCentroMouseExited(evt);
            }
        });
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });

        btnAgrandar.setText("Agrandar");
        btnAgrandar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgrandarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgrandarMouseExited(evt);
            }
        });
        btnAgrandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrandarActionPerformed(evt);
            }
        });

        btnReducir.setText("Reducir");
        btnReducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReducirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReducirMouseExited(evt);
            }
        });
        btnReducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirActionPerformed(evt);
            }
        });

        jLabel1.setText("Martínez Mendoza Jesús Ángel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(btnEsquina, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCentro)
                .addGap(18, 18, 18)
                .addComponent(btnAgrandar)
                .addGap(18, 18, 18)
                .addComponent(btnReducir)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCentro)
                        .addComponent(btnAgrandar)
                        .addComponent(btnReducir))
                    .addComponent(btnEsquina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirActionPerformed
        // TODO add your handling code here:
        Dimension size = lblNombre.getSize();
        lblNombre.setSize(size.width - 5, size.height - 5);
    }//GEN-LAST:event_btnReducirActionPerformed

    private void btnEsquinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsquinaMouseEntered
        // TODO add your handling code here:
        btnEsquina.setSize(82, 33);
    }//GEN-LAST:event_btnEsquinaMouseEntered

    private void btnEsquinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsquinaMouseExited
        // TODO add your handling code here:
        btnEsquina.setSize(72, 23);
    }//GEN-LAST:event_btnEsquinaMouseExited

    private void btnCentroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCentroMouseEntered
        // TODO add your handling code here:
        btnCentro.setSize(82, 33);
    }//GEN-LAST:event_btnCentroMouseEntered

    private void btnCentroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCentroMouseExited
        // TODO add your handling code here:
        btnCentro.setSize(82, 23);
    }//GEN-LAST:event_btnCentroMouseExited

    private void btnAgrandarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgrandarMouseEntered
        // TODO add your handling code here:
        btnAgrandar.setSize(82, 33);
    }//GEN-LAST:event_btnAgrandarMouseEntered

    private void btnAgrandarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgrandarMouseExited
        // TODO add your handling code here:
        btnAgrandar.setSize(82, 23);
    }//GEN-LAST:event_btnAgrandarMouseExited

    private void btnReducirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReducirMouseEntered
        // TODO add your handling code here:
        btnReducir.setSize(82, 33);
    }//GEN-LAST:event_btnReducirMouseEntered

    private void btnReducirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReducirMouseExited
        // TODO add your handling code here:
        btnReducir.setSize(82, 23);
    }//GEN-LAST:event_btnReducirMouseExited

    private void btnEsquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquinaActionPerformed
        // TODO add your handling code here:
        lblNombre.setLocation(getWidth() - lblNombre.getWidth()-20, 10);
    }//GEN-LAST:event_btnEsquinaActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        // TODO add your handling code here:
        lblNombre.setLocation((getWidth() - lblNombre.getWidth())/2, (getHeight() - lblNombre.getHeight())/2);
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnAgrandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrandarActionPerformed
        // TODO add your handling code here:
        Dimension size = lblNombre.getSize();
        lblNombre.setSize(size.width + 5, size.height + 5);
    }//GEN-LAST:event_btnAgrandarActionPerformed

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
            java.util.logging.Logger.getLogger(Actividad6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrandar;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnEsquina;
    private javax.swing.JButton btnReducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
