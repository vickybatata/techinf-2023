
package Cliente;

import Cliente.Cliente;
import javax.swing.JOptionPane;

public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
        initComponents();
        lbCod.setEnabled(true);
        jTextFCod.setEnabled(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lbnome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbDataNascimento = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbEstadoCivil = new javax.swing.JLabel();
        lbProfissao = new javax.swing.JLabel();
        jTextFNome = new javax.swing.JTextField();
        jTextFCPF = new javax.swing.JTextField();
        jTextFEndereco = new javax.swing.JTextField();
        jTextFTelefone = new javax.swing.JTextField();
        jTextFEmail = new javax.swing.JTextField();
        jTextFDataNascimento = new javax.swing.JTextField();
        jTextFProfissao = new javax.swing.JTextField();
        jButtonMostrar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFSexo = new javax.swing.JTextField();
        jTextFEstadoCivil = new javax.swing.JTextField();
        jTextFCod = new javax.swing.JTextField();
        lbCod = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiDados = new javax.swing.JMenu();
        jMenuDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbnome.setText("Nome Completo:");

        lbCPF.setText("CPF:");

        lbEndereco.setText("Endereço:");

        lbTelefone.setText("Telefone:");

        lbEmail.setText("Email:");

        lbDataNascimento.setText("Data De Nascimento:");

        lbSexo.setText("Sexo:");

        lbEstadoCivil.setText("Estado Civil:");

        lbProfissao.setText("Profissão:");

        jTextFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNomeActionPerformed(evt);
            }
        });

        jTextFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFCPFActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        lbCod.setText("Codigo:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addGap(52, 52, 52)
                        .addComponent(btnAtualizar)
                        .addGap(61, 61, 61)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbProfissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(104, 104, 104))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                    .addComponent(lbnome)
                                    .addComponent(lbCod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDataNascimento))
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFDataNascimento)
                            .addComponent(jTextFSexo)
                            .addComponent(jTextFEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jTextFProfissao)))
                    .addComponent(jTextFTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFCod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnome)
                    .addComponent(jTextFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(jTextFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(jTextFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(jTextFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimento)
                    .addComponent(jTextFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(jTextFSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstadoCivil)
                    .addComponent(jTextFEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfissao)
                    .addComponent(jTextFProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonFechar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(15, 15, 15))
        );

        jmiDados.setText("File");

        jMenuDados.setText("Dados");
        jMenuDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDadosActionPerformed(evt);
            }
        });
        jmiDados.add(jMenuDados);

        jMenuBar1.add(jmiDados);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFCPFActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
       Cliente c = this.MontarCliente();
       JOptionPane.showMessageDialog(null, c.getNomeCompleto()+"\n"+c.getCPF()+
               "\n"+c.getEndereco()+"\n"+c.getTelefone()+"\n"+c.getEmail()+"\n"+
               c.getDataNasc()+"\n"+c.getSexo()+"\n"+c.getEstadoCivil()+"\n"+
               c.getProfissao());
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jTextFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNomeActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Cliente c = this.MontarCliente();
      if (c != null && !jTextFCod.getText().trim().isEmpty()) {
          c.setCod(Integer.parseInt(jTextFCod.getText()));
          ClienteControle ccntl = new ClienteControle();
          ccntl.update(c);
        } else {
           JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
         Cliente c = this.MontarCliente();
          if (c != null){
           ClienteControle ccntl = new ClienteControle();
           ccntl.insert(c);
          }else {
               JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
 
          }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if(!jTextFCod.getText().trim().isEmpty()){
         int cod = Integer.parseInt(jTextFCod.getText());
         ClienteControle ccntl = new ClienteControle();
        
        }else{
            JOptionPane.showMessageDialog(null,"Informe novamente...");
         } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
         this.dispose();
         
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jMenuDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDadosActionPerformed
        ClienteControle cc = new ClienteControle();
         cc.selectALL();
    }//GEN-LAST:event_jMenuDadosActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }
    
     public Cliente MontarCliente() {
         Cliente c = new Cliente();
         c.setNomeCompleto(jTextFNome.getText());
         c.setCPF(jTextFCPF.getText());
         c.setEndereco(jTextFEndereco.getText());
         c.setTelefone(jTextFTelefone.getText());
         c.setEmail(jTextFEmail.getText());
         c.setDataNasc(jTextFDataNascimento.getText());
         c.setSexo(jTextFSexo.getText());
         c.setEstadoCivil(jTextFEstadoCivil.getText());
         c.setProfissao(jTextFProfissao.getText());
         return c;
         
     }

     public void Limpar () {
       jTextFCod.setText("");
       jTextFNome.setText("");
       jTextFCPF.setText("");
       jTextFEndereco.setText("");
       jTextFTelefone.setText("");
       jTextFEmail.setText("");
       jTextFDataNascimento.setText("");
       jTextFSexo.setText("");
       jTextFEstadoCivil.setText("");
       jTextFProfissao.setText("");
     }
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFCPF;
    private javax.swing.JTextField jTextFCod;
    private javax.swing.JTextField jTextFDataNascimento;
    private javax.swing.JTextField jTextFEmail;
    private javax.swing.JTextField jTextFEndereco;
    private javax.swing.JTextField jTextFEstadoCivil;
    private javax.swing.JTextField jTextFNome;
    private javax.swing.JTextField jTextFProfissao;
    private javax.swing.JTextField jTextFSexo;
    private javax.swing.JTextField jTextFTelefone;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenu jmiDados;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstadoCivil;
    private javax.swing.JLabel lbProfissao;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbnome;
    // End of variables declaration//GEN-END:variables
}
