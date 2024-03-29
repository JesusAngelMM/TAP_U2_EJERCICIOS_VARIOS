/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Unidad2;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Actividad7 extends javax.swing.JFrame {

    /**
     * Creates new form Actividad7
     */
    public Actividad7() {
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

        jLabel1 = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        btnAzul = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnFondoAzul = new javax.swing.JButton();
        btnFondoRojo = new javax.swing.JButton();
        btnFondoVerde = new javax.swing.JButton();
        btnTransparente = new javax.swing.JButton();
        btnOpaca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Martínez Mendoza Jesús Ángel");

        lblTexto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("Hola mundo");
        lblTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblTexto.setOpaque(true);

        btnAzul.setText("Azul");
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });

        btnRojo.setText("Rojo");
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });

        btnVerde.setText("Verde");
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnFondoAzul.setText("Fondo Azul");
        btnFondoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondoAzulActionPerformed(evt);
            }
        });

        btnFondoRojo.setText("Fondo Rojo");
        btnFondoRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondoRojoActionPerformed(evt);
            }
        });

        btnFondoVerde.setText("Fondo Verde");
        btnFondoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFondoVerdeActionPerformed(evt);
            }
        });

        btnTransparente.setText("Transparente");
        btnTransparente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransparenteActionPerformed(evt);
            }
        });

        btnOpaca.setText("Opaca");
        btnOpaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnFondoRojo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(btnFondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTransparente)
                                            .addComponent(btnOpaca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnFondoVerde))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAzul)
                    .addComponent(btnFondoAzul)
                    .addComponent(btnTransparente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRojo)
                    .addComponent(btnFondoRojo)
                    .addComponent(btnOpaca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerde)
                    .addComponent(btnFondoVerde))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        lblTexto.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        lblTexto.setForeground(Color.RED);
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        lblTexto.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnFondoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondoAzulActionPerformed
        lblTexto.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnFondoAzulActionPerformed

    private void btnFondoRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondoRojoActionPerformed
        lblTexto.setBackground(Color.RED);
    }//GEN-LAST:event_btnFondoRojoActionPerformed

    private void btnFondoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFondoVerdeActionPerformed
        lblTexto.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnFondoVerdeActionPerformed

    private void btnTransparenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransparenteActionPerformed
        lblTexto.setOpaque(false);
        lblTexto.repaint();
    }//GEN-LAST:event_btnTransparenteActionPerformed

    private void btnOpacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpacaActionPerformed
        lblTexto.setOpaque(true);
    }//GEN-LAST:event_btnOpacaActionPerformed

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
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnFondoAzul;
    private javax.swing.JButton btnFondoRojo;
    private javax.swing.JButton btnFondoVerde;
    private javax.swing.JButton btnOpaca;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnTransparente;
    private javax.swing.JButton btnVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
