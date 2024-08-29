package Eventos;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FormEventos extends javax.swing.JFrame {

  EventosControle ectrl = new EventosControle();
  
    public FormEventos() {
        initComponents();
        lbCod.setVisible(false);
        jTextFCod.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbHorarioInicio = new javax.swing.JLabel();
        lbHorarioTermino = new javax.swing.JLabel();
        lbLocal = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbPublicoAlvo = new javax.swing.JLabel();
        lbCapacidadeMaxima = new javax.swing.JLabel();
        lbOrganizador = new javax.swing.JLabel();
        jTextFNome = new javax.swing.JTextField();
        jTextFData = new javax.swing.JTextField();
        jTextFHorarioInicio = new javax.swing.JTextField();
        jTextFHorariotermino = new javax.swing.JTextField();
        jTextFLocal = new javax.swing.JTextField();
        jTextFDescricao = new javax.swing.JTextField();
        jTextFPublicoAlvo = new javax.swing.JTextField();
        jTextFCapacidadeMaxima = new javax.swing.JTextField();
        jTextFOrganizador = new javax.swing.JTextField();
        jButtonMostrar = new javax.swing.JButton();
        jButtonfechar = new javax.swing.JButton();
        lbCod = new javax.swing.JLabel();
        jTextFCod = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiDados = new javax.swing.JMenu();
        jMenuDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNome.setText("Nome do Evento:");

        lbData.setText("Data do Evento:");

        lbHorarioInicio.setText("Horário de Início:");

        lbHorarioTermino.setText("Horário de Término:");

        lbLocal.setText("Local do Evento:");

        lbDescricao.setText("Descrição:");

        lbPublicoAlvo.setText("Público Alvo:");

        lbCapacidadeMaxima.setText("Capacidade Máxima:");

        lbOrganizador.setText("Organizador:");

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonfechar.setText("Fechar");
        jButtonfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfecharActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbHorarioTermino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFHorariotermino, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbOrganizador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCapacidadeMaxima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jTextFCapacidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbPublicoAlvo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFPublicoAlvo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbHorarioInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFData, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(lbCod))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jTextFCod))))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonMostrar)
                        .addGap(24, 24, 24)
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar)
                        .addGap(28, 28, 28)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonfechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCod)
                    .addComponent(jTextFCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(jTextFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(jTextFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHorarioInicio)
                    .addComponent(jTextFHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHorarioTermino)
                    .addComponent(jTextFHorariotermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocal)
                    .addComponent(jTextFLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(jTextFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPublicoAlvo)
                    .addComponent(jTextFPublicoAlvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCapacidadeMaxima)
                    .addComponent(jTextFCapacidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrganizador)
                    .addComponent(jTextFOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonfechar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(16, 16, 16))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        Eventos e = this.MontarEventos();
        JOptionPane.showMessageDialog(null, e.getNomeEv()+" "+e.getData()+" "+
                e.getHorarioInicio()+" "+e.getHorarioTerm()+" "+e.getLocal()+" "+
                e.getDescricao()+" "+e.getPublicoAlvo()+" "+e.getCapacMax()+" "+
                e.getOrgan());
        
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Eventos e = this.MontarEventos();
        if (e != null) {
         ectrl.insert(e);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos +"
                    + " corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Eventos e = this.MontarEventos();
        if (e != null && !jTextFCod.getText().trim().isEmpty()) {
            e.setCod(Integer.parseInt(jTextFCod.getText()));
            EventosControle ecntl = new EventosControle();
            ecntl.update(e);
        }else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos +"
                    + "corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
      
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(!jTextFCod.getText().trim().isEmpty()){
         int cod = Integer.parseInt(jTextFCod.getText());
         EventosControle ecntl = new EventosControle();
        
        }else{
            JOptionPane.showMessageDialog(null,"Informe novamente...");
         } 
                                 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDadosActionPerformed
        EventosControle ec = new EventosControle();
        ec.selectALL();
    }//GEN-LAST:event_jMenuDadosActionPerformed

    private void jButtonfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfecharActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButtonfecharActionPerformed

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
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEventos().setVisible(true);
            }
        });
    }
    
    public Eventos MontarEventos(){
        
        Eventos e = new Eventos();
        e.setNomeEv(jTextFNome.getText());
        e.setData(jTextFData.getText());
        e.setHorarioInicio(jTextFHorarioInicio.getText());
        e.setHorarioTerm(jTextFHorariotermino.getText());
        e.setLocal(jTextFLocal.getText());
        e.setDescricao(jTextFDescricao.getText());
        e.setPublicoAlvo(jTextFPublicoAlvo.getText());
        e.setCapacMax(jTextFCapacidadeMaxima.getText());
        e.setOrgan(jTextFOrganizador.getText());
        return e;
    }
    
    public void Limpar(){
       
        jTextFCod.setText("");
        jTextFNome.setText("");
        jTextFData.setText("");
        jTextFHorarioInicio.setText("");
        jTextFHorariotermino.setText("");
        jTextFLocal.setText("");
        jTextFDescricao.setText("");
        jTextFPublicoAlvo.setText("");
        jTextFCapacidadeMaxima.setText("");
        jTextFOrganizador.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonfechar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFCapacidadeMaxima;
    private javax.swing.JTextField jTextFCod;
    private javax.swing.JTextField jTextFData;
    private javax.swing.JTextField jTextFDescricao;
    private javax.swing.JTextField jTextFHorarioInicio;
    private javax.swing.JTextField jTextFHorariotermino;
    private javax.swing.JTextField jTextFLocal;
    private javax.swing.JTextField jTextFNome;
    private javax.swing.JTextField jTextFOrganizador;
    private javax.swing.JTextField jTextFPublicoAlvo;
    private javax.swing.JMenu jmiDados;
    private javax.swing.JLabel lbCapacidadeMaxima;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbHorarioInicio;
    private javax.swing.JLabel lbHorarioTermino;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbOrganizador;
    private javax.swing.JLabel lbPublicoAlvo;
    // End of variables declaration//GEN-END:variables
}
