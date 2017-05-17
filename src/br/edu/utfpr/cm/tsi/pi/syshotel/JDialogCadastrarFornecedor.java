/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.dao.DaoFornecedor;
import br.edu.utfpr.cm.pi.modal.Fornecedor;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import javax.swing.JDialog;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastrarFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarFornecedor
     */
    public JDialogCadastrarFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabelImagemCadForn = new javax.swing.JLabel();
        jLabelCadFornCodigo = new javax.swing.JLabel();
        tfCod = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabelCadFornNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btFeclar = new javax.swing.JButton();
        jSeparatorCadForn = new javax.swing.JSeparator();
        jLabelCadForn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ftfCnpj = new javax.swing.JFormattedTextField();
        btObter = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(665, 280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagemCadForn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImagemCadForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Truck.png"))); // NOI18N
        getContentPane().add(jLabelImagemCadForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 130, 90));

        jLabelCadFornCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadFornCodigo.setText("Código:");
        getContentPane().add(jLabelCadFornCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        tfCod.setEditable(false);
        tfCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, 25));

        tfNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 313, 25));

        jLabelCadFornNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadFornNome.setText("Nome:");
        getContentPane().add(jLabelCadFornNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jSeparator1.setMaximumSize(new java.awt.Dimension(740, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(740, 5));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 740, 5));

        btSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/save01.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        btLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        btDeletar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/trash.png"))); // NOI18N
        btDeletar.setToolTipText("Apagar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btFeclar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btFeclar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        btFeclar.setToolTipText("Fechar");
        btFeclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFeclarActionPerformed(evt);
            }
        });
        getContentPane().add(btFeclar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jSeparatorCadForn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorCadForn.setMaximumSize(new java.awt.Dimension(750, 5));
        jSeparatorCadForn.setMinimumSize(new java.awt.Dimension(750, 5));
        jSeparatorCadForn.setPreferredSize(new java.awt.Dimension(740, 5));
        getContentPane().add(jSeparatorCadForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabelCadForn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadForn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/CadFornecedor.png"))); // NOI18N
        getContentPane().add(jLabelCadForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 300, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("CNPJ:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        try {
            ftfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ftfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 25));

        btObter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btObter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Add.png"))); // NOI18N
        btObter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObterActionPerformed(evt);
            }
        });
        getContentPane().add(btObter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 30, 25));

        setSize(new java.awt.Dimension(681, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFeclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFeclarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_btFeclarActionPerformed

    private void btObterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObterActionPerformed
        obter();
    }//GEN-LAST:event_btObterActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Salvar?")) {
            salvar();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        if (Util.imprimirConfirmacao("Deseja Limpar Dados?")) {
            novo();
        }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Deletar?")) {
            remover();
        }
    }//GEN-LAST:event_btDeletarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFeclar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btObter;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfCnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadForn;
    private javax.swing.JLabel jLabelCadFornCodigo;
    private javax.swing.JLabel jLabelCadFornNome;
    private javax.swing.JLabel jLabelImagemCadForn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorCadForn;
    private javax.swing.JTextField tfCod;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void novo() {
        tfCod.setText(null);
        tfNome.setText(null);
        ftfCnpj.setText(null);
    }

    private void salvar() {
        if (validar()) {
            Fornecedor fornecedor = new Fornecedor();
            if (!tfCod.getText().isEmpty()) {  //verifica se o campo Codigo esta vazio
                fornecedor.setId(Integer.parseInt(tfCod.getText()));
            }
            fornecedor.setNome(tfNome.getText().trim());
            fornecedor.setCnpj(ftfCnpj.getText());

            try {
                new DaoFornecedor().persistir(fornecedor);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Util.dispayMsg("Salvo com Sucesso!");
            novo();
        } else {
            Util.dispayMsg("Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    private void remover() {
        if (!tfCod.getText().isEmpty()) {
            int id = Integer.parseInt(tfCod.getText());

            try {
                DaoFornecedor dao = new DaoFornecedor();
                dao.remover(dao.obterPorId(id));

            } catch (RuntimeException e) {

                Util.dispayMsg("Falha inesperada ao executar");
            }
            novo();
        } else {
            Util.dispayMsg("Nenhum registro selecionando!");
        }

    }

    private boolean validar() {

        if (!tfNome.getText().isEmpty() && !("  .   .   /    -  ").equals(ftfCnpj.getText())) {
            return true;
        }
        return false;

    }

    private void obter() {
        JDialog dialog = new JDialogPesquisarFornecedor(null, true);
        Util.abrirJDialogCentralizado(dialog);
        if (Data.hash.get("fornacedor") == null) {
            return;
        } else {
            if (Data.hash.get("fornacedor") instanceof Fornecedor) {
                Fornecedor forn = (Fornecedor) Data.hash.get("fornacedor");
                Data.hash.remove("fornacedor");
                if (forn == null) {
                    return;
                }
                tfCod.setText(String.valueOf(forn.getId()));
                tfNome.setText(forn.getNome());
                ftfCnpj.setText(forn.getCnpj());

            } else {
                Util.dispayMsg("Selecione um Grupo De Produto.");
                Data.hash.remove("fornecedor");//limpra o conteudo do map
            }
        }

    }
}
