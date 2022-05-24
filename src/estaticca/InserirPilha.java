/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticca;

/**
 *
 * @author elton
 */
public class InserirPilha extends javax.swing.JFrame {

    Object memo[];
    private int Tam;
    private int topo;

    public InserirPilha() {
        Tam = 30;
        memo = new Object[Tam];
        topo = -1;
        initComponents();
    }

    public boolean isEmpty() {
        //if(topo == -1){
        //return true;
        //}else{
        //  return false;
        //}
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == Tam - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPorduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botIserir = new javax.swing.JButton();
        botExcluir = new javax.swing.JButton();
        botMostrar = new javax.swing.JButton();
        lblMostrar = new javax.swing.JLabel();
        botMostrartopo = new javax.swing.JButton();
        lblSpam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Objetos a pilha");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));
        jPanel1.setLayout(null);
        jPanel1.add(txtPorduto);
        txtPorduto.setBounds(30, 30, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Produto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 100, 20);

        botIserir.setText("Inserir");
        botIserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIserirActionPerformed(evt);
            }
        });
        jPanel1.add(botIserir);
        botIserir.setBounds(150, 30, 110, 23);

        botExcluir.setText("Excluir");
        botExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(botExcluir);
        botExcluir.setBounds(270, 30, 110, 23);

        botMostrar.setText("mostrar tudo");
        botMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botMostrar);
        botMostrar.setBounds(270, 60, 110, 23);

        lblMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        jPanel1.add(lblMostrar);
        lblMostrar.setBounds(30, 100, 350, 50);

        botMostrartopo.setText("mostrar topo");
        botMostrartopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMostrartopoActionPerformed(evt);
            }
        });
        jPanel1.add(botMostrartopo);
        botMostrartopo.setBounds(150, 60, 110, 23);

        lblSpam.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSpam.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lblSpam);
        lblSpam.setBounds(30, 70, 110, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 410, 210);

        setSize(new java.awt.Dimension(445, 271));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botIserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIserirActionPerformed
        
        if (!isFull()) {
            topo++;
            memo[topo] = txtPorduto.getText();
            txtPorduto.setText(" ");
            lblSpam.setText("Inserido com Sucesso");
            

        } else {
            lblMostrar.setText("Pilha cheia ");
        }
        


    }//GEN-LAST:event_botIserirActionPerformed

    private void botExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirActionPerformed
        if (evt.getSource() == botExcluir) {
            
            if (!isEmpty()) {
                lblMostrar.setText("Objetor excluido: " + memo[topo--]);
                lblSpam.setText("Excluido com Sucesso");

            } else {
                lblMostrar.setText("nada");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_botExcluirActionPerformed

    private void botMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMostrarActionPerformed
        if (!isEmpty()) {
            String resp = " ";
            for (int i = 0; i <= topo; i++) {
                resp += memo[i] + ", ";

            }
            lblMostrar.setText("A pilha é [ " + resp + " ]");

        } else {
            lblMostrar.setText("A pilha está vazia ");

        }

// TODO add your handling code here:
    }//GEN-LAST:event_botMostrarActionPerformed

    private void botMostrartopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMostrartopoActionPerformed
        if (!isEmpty()) {
            lblMostrar.setText(" o topo é:  " + memo[topo]);
        } else {
            lblMostrar.setText(" Não tem nada na pilha");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botMostrartopoActionPerformed

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
            java.util.logging.Logger.getLogger(InserirPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirPilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botExcluir;
    private javax.swing.JButton botIserir;
    private javax.swing.JButton botMostrar;
    private javax.swing.JButton botMostrartopo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblSpam;
    private javax.swing.JTextField txtPorduto;
    // End of variables declaration//GEN-END:variables
}
