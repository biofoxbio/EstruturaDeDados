
package estaticca;


public class FormFila extends javax.swing.JFrame {

    private int total;
    private int comeco;
    private int fim;
    private Object memo[];
    private int Tamanho;

    public FormFila() {
        Tamanho = 7;
        memo = new Object[Tamanho];
        total = 0;
        comeco = 0;
        fim = 0;
        initComponents();
    }

    public boolean isEmpty() {
        return (total == 0);
    }

    private boolean isFull() {
        return (total == Tamanho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botInserir = new javax.swing.JButton();
        botExcluir = new javax.swing.JButton();
        botMostratFila = new javax.swing.JButton();
        lbltela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fila"));
        jPanel1.setLayout(null);
        jPanel1.add(txtValor);
        txtValor.setBounds(30, 50, 380, 40);

        jLabel1.setText("Valor");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 100, 20);

        botInserir.setText("Inserir");
        botInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInserirActionPerformed(evt);
            }
        });
        jPanel1.add(botInserir);
        botInserir.setBounds(30, 100, 110, 30);

        botExcluir.setText("Excluir");
        botExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(botExcluir);
        botExcluir.setBounds(150, 100, 120, 30);

        botMostratFila.setText("Motrar Fila");
        botMostratFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMostratFilaActionPerformed(evt);
            }
        });
        jPanel1.add(botMostratFila);
        botMostratFila.setBounds(280, 100, 130, 30);

        lbltela.setBackground(new java.awt.Color(255, 255, 255));
        lbltela.setOpaque(true);
        jPanel1.add(lbltela);
        lbltela.setBounds(20, 230, 400, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 450, 400);

        setSize(new java.awt.Dimension(485, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInserirActionPerformed
        if (!isFull()) {
            memo[fim++] = txtValor.getText();
            fim %= Tamanho;
            total++;
            lbltela.setText("inserido na fila");
            txtValor.setText("");
        } else {
            lbltela.setText("Fila cheia");
        }
       

    }//GEN-LAST:event_botInserirActionPerformed

    private void botExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirActionPerformed
        if (!isEmpty()) {
            Object resp;
            resp = memo[comeco++];
            comeco %= Tamanho;
            total--;
            lbltela.setText("" + resp);
        } else {
            lbltela.setText("Fila vazia");
        }
    }//GEN-LAST:event_botExcluirActionPerformed

    private void botMostratFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMostratFilaActionPerformed

        if (!isEmpty()) {
            String com = " ";

            for (int i = comeco; i != fim; i++) {
                com += memo[i] + ",";

                lbltela.setText("[" + com + "]");

            }

        }


    }//GEN-LAST:event_botMostratFilaActionPerformed

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
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botExcluir;
    private javax.swing.JButton botInserir;
    private javax.swing.JButton botMostratFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltela;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
