/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_a3;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
    }

    public JLabel getLblDado1() {
        return lblDado1;
    }

    public JLabel getLblDado10() {
        return lblDado10;
    }

    public JLabel getLblDado2() {
        return lblDado2;
    }

    public JLabel getLblDado3() {
        return lblDado3;
    }

    public JLabel getLblDado4() {
        return lblDado4;
    }

    public JLabel getLblDado5() {
        return lblDado5;
    }

    public JLabel getLblDado6() {
        return lblDado6;
    }

    public JLabel getLblDado7() {
        return lblDado7;
    }

    public JLabel getLblDado8() {
        return lblDado8;
    }

    public JLabel getLblDado9() {
        return lblDado9;
    }

    public void setLblDado1(JLabel lblDado1) {
        this.lblDado1 = lblDado1;
    }

    public void setLblDado10(JLabel lblDado10) {
        this.lblDado10 = lblDado10;
    }

    public void setLblDado2(JLabel lblDado2) {
        this.lblDado2 = lblDado2;
    }

    public void setLblDado3(JLabel lblDado3) {
        this.lblDado3 = lblDado3;
    }

    public void setLblDado4(JLabel lblDado4) {
        this.lblDado4 = lblDado4;
    }

    public void setLblDado5(JLabel lblDado5) {
        this.lblDado5 = lblDado5;
    }

    public void setLblDado6(JLabel lblDado6) {
        this.lblDado6 = lblDado6;
    }

    public void setLblDado7(JLabel lblDado7) {
        this.lblDado7 = lblDado7;
    }

    public void setLblDado8(JLabel lblDado8) {
        this.lblDado8 = lblDado8;
    }

    public void setLblDado9(JLabel lblDado9) {
        this.lblDado9 = lblDado9;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        lblDado3 = new javax.swing.JLabel();
        lblDado4 = new javax.swing.JLabel();
        lblDado5 = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        lblDado6 = new javax.swing.JLabel();
        lblDado7 = new javax.swing.JLabel();
        lblDado8 = new javax.swing.JLabel();
        lblDado9 = new javax.swing.JLabel();
        lblDado10 = new javax.swing.JLabel();
        btnJogar2 = new javax.swing.JButton();
        btnRejogar1 = new javax.swing.JButton();
        btnRejogar2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAtualizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJogar.setText("Jogador 1");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnJogar2.setText("Jogador 2");
        btnJogar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogar2ActionPerformed(evt);
            }
        });

        btnRejogar1.setText("Re-Jogar");
        btnRejogar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejogar1ActionPerformed(evt);
            }
        });

        btnRejogar2.setText("Re-Jogar 2");
        btnRejogar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejogar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnJogar)
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRejogar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRejogar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(btnJogar2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDado6)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado6)
                    .addComponent(lblDado1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado2)
                    .addComponent(lblDado7))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado8)
                    .addComponent(lblDado3))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado4)
                    .addComponent(lblDado9))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado5)
                    .addComponent(lblDado10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnRejogar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJogar2)
                    .addComponent(btnJogar)
                    .addComponent(btnRejogar2))
                .addGap(22, 22, 22))
        );

        jMenu1.setText("Menu");

        jmiLimpar.setText("Limpar");
        jmiLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimparActionPerformed(evt);
            }
        });
        jMenu1.add(jmiLimpar);

        jmiAtualizar.setText("Atualizar");
        jmiAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtualizarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAtualizar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        Jogador1();       
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnJogar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogar2ActionPerformed
        Jogador2();
    }//GEN-LAST:event_btnJogar2ActionPerformed

    private void btnRejogar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejogar1ActionPerformed
        if (btnRejogar1.isEnabled()){
            NovaTela nt = new NovaTela();
            nt.setVisible(true);
            setVisible(true);
        }
    }//GEN-LAST:event_btnRejogar1ActionPerformed

    private void jmiLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimparActionPerformed
        if (jmiLimpar.isEnabled()) {
            lblDado1.setText("");
            lblDado2.setText("");
            lblDado3.setText("");
            lblDado4.setText("");
            lblDado5.setText("");
            lblDado6.setText("");
            lblDado7.setText("");
            lblDado8.setText("");
            lblDado9.setText("");
            lblDado10.setText("");
        }
    }//GEN-LAST:event_jmiLimparActionPerformed

    private void btnRejogar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejogar2ActionPerformed
        if (btnRejogar2.isEnabled()){
            NovaTela1 nt = new NovaTela1();
            nt.setVisible(true);
            setVisible(true);
        }
    }//GEN-LAST:event_btnRejogar2ActionPerformed

    private void jmiAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtualizarActionPerformed
        atualizarJogador1();
    }//GEN-LAST:event_jmiAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnJogar2;
    private javax.swing.JButton btnRejogar1;
    private javax.swing.JButton btnRejogar2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiAtualizar;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado10;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblDado3;
    private javax.swing.JLabel lblDado4;
    private javax.swing.JLabel lblDado5;
    private javax.swing.JLabel lblDado6;
    private javax.swing.JLabel lblDado7;
    private javax.swing.JLabel lblDado8;
    private javax.swing.JLabel lblDado9;
    // End of variables declaration//GEN-END:variables
    
    public void Jogador1(){
        int valor1, valor2, valor3, valor4, valor5;
        Random random = new Random();
        valor1 = random.nextInt(6) + 1;
        valor2 = random.nextInt(6) + 1;
        valor3 = random.nextInt(6) + 1;
        valor4 = random.nextInt(6) + 1;
        valor5 = random.nextInt(6) + 1;
        lblDado1.setText(Integer.toString(valor1));
        lblDado2.setText(Integer.toString(valor2));
        lblDado3.setText(Integer.toString(valor3));
        lblDado4.setText(Integer.toString(valor4));
        lblDado5.setText(Integer.toString(valor5));
        if (btnJogar.isEnabled()) {
            btnJogar.setEnabled(false);
        }
    }
    
    public void Jogador2(){
        int valor1, valor2, valor3, valor4, valor5;
        Random random = new Random();
        valor1 = random.nextInt(6) + 1;
        valor2 = random.nextInt(6) + 1;
        valor3 = random.nextInt(6) + 1;
        valor4 = random.nextInt(6) + 1;
        valor5 = random.nextInt(6) + 1;
        lblDado6.setText(Integer.toString(valor1));
        lblDado7.setText(Integer.toString(valor2));
        lblDado8.setText(Integer.toString(valor3));
        lblDado9.setText(Integer.toString(valor4));
        lblDado10.setText(Integer.toString(valor5));
        if (btnJogar2.isEnabled()) {
            btnJogar2.setEnabled(false);
        }
    }
    
    public void atualizarJogador1(){
        NovaTela nt = new NovaTela();
        
        setLblDado1(nt.getLblDado_1());
        setLblDado2(nt.getLblDado_2());
        setLblDado3(nt.getLblDado_3());
        setLblDado4(nt.getLblDado_4());
        setLblDado5(nt.getLblDado_5());
        
    }

}