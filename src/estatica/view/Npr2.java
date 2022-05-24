
package estatica.view;

import estatica.aplicacoes.NPR;



public class Npr2 extends javax.swing.JFrame {

    
    public Npr2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnpr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtntpf1 = new javax.swing.JTextField();
        botCalculo = new javax.swing.JButton();
        botverifica = new javax.swing.JButton();
        lblResul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Desafio NPR2"));
        jPanel1.setLayout(null);

        txtnpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnprActionPerformed(evt);
            }
        });
        jPanel1.add(txtnpr);
        txtnpr.setBounds(40, 140, 200, 30);

        jLabel1.setText("Notação Pós-Fixa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 14, 170, 30);

        jLabel2.setText("Notação polonesa Reversa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 100, 150, 30);

        txtntpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtntpf1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtntpf1);
        txtntpf1.setBounds(38, 50, 200, 30);

        botCalculo.setText("Calculo");
        botCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCalculoActionPerformed(evt);
            }
        });
        jPanel1.add(botCalculo);
        botCalculo.setBounds(340, 90, 100, 23);

        botverifica.setText("Converção");
        botverifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botverificaActionPerformed(evt);
            }
        });
        jPanel1.add(botverifica);
        botverifica.setBounds(340, 50, 100, 23);

        lblResul.setBackground(new java.awt.Color(255, 255, 255));
        lblResul.setOpaque(true);
        jPanel1.add(lblResul);
        lblResul.setBounds(40, 230, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(13, 11, 500, 290);

        setSize(new java.awt.Dimension(546, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnprActionPerformed

    private void txtntpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtntpf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtntpf1ActionPerformed

    private void botverificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botverificaActionPerformed

        String npr = NPR.toNPR2(txtntpf1.getText());
        txtnpr.setText(npr);

    }//GEN-LAST:event_botverificaActionPerformed

    private void botCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCalculoActionPerformed
        float npi = NPR.solveNPR(txtntpf1.getText());
        lblResul.setText(String.valueOf(npi));


    }//GEN-LAST:event_botCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(Npr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Npr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Npr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Npr2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Npr2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCalculo;
    private javax.swing.JButton botverifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResul;
    private javax.swing.JTextField txtnpr;
    private javax.swing.JTextField txtntpf1;
    // End of variables declaration//GEN-END:variables
}
