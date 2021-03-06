/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.dao.DaoApartamento;
import br.edu.utfpr.cm.pi.dao.DaoReserva;
import br.edu.utfpr.cm.pi.modal.Apartamento;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogPesquisarApartamento extends javax.swing.JDialog {

    private DefaultTableModel model;
    private String dadosApts[] = new String[]{"Cod", "Numero", "Andar", "Descrição"};
    private List<Apartamento> apts;

    /**
     * Creates new form JDialogPesquisarApartamento
     */
    public JDialogPesquisarApartamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagemPesApt = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelPesAptDescr = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonReservar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbApartamento = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagemPesApt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImagemPesApt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagemPesApt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Pesquisar Apartamento.png"))); // NOI18N
        jLabelImagemPesApt.setMaximumSize(new java.awt.Dimension(300, 100));
        jLabelImagemPesApt.setMinimumSize(new java.awt.Dimension(300, 100));
        jLabelImagemPesApt.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(jLabelImagemPesApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 380, 50));

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCodigo.setText("Descrição:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelPesAptDescr.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesAptDescr.setText("Número:");
        getContentPane().add(jLabelPesAptDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        tfNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 30));

        tfDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });
        tfDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDescricaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDescricaoKeyReleased(evt);
            }
        });
        getContentPane().add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 30));

        jButtonAtualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/update.png"))); // NOI18N
        jButtonAtualizar.setToolTipText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jButtonFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jButtonReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PROJECT/flat.png"))); // NOI18N
        jButtonReservar.setToolTipText("Reservar");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jSeparator1.setMaximumSize(new java.awt.Dimension(611, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(611, 1));
        jSeparator1.setPreferredSize(new java.awt.Dimension(611, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 800, 10));

        tbApartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Número", "Andar", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbApartamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbApartamento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 740, 150));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PesquisarPadrao.png"))); // NOI18N
        btPesquisar.setMaximumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setMinimumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setPreferredSize(new java.awt.Dimension(28, 25));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 30, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        obterPorNumero();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescricaoKeyReleased
//        obterPorDescricao();
    }//GEN-LAST:event_tfDescricaoKeyReleased

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void tfDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescricaoKeyPressed
        obterPorDescricao();
    }//GEN-LAST:event_tfDescricaoKeyPressed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastrarApartamento(null, true));
    }//GEN-LAST:event_jButtonReservarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        if (Util.dispayMsg("Deseja Limpar dados?")) {
            novo();
        }
    }//GEN-LAST:event_jButtonLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelImagemPesApt;
    private javax.swing.JLabel jLabelPesAptDescr;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbApartamento;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables

    private void obterPorNumero() {
        if (!tfNumero.getText().isEmpty()) {
            try {
                model = new DefaultTableModel();
                model.setColumnIdentifiers(dadosApts);
                Apartamento apt = new DaoApartamento().obterPorNumero(tfNumero.getText());
                apts.clear();
                apts.add(apt);
                prencherTabela();
            } catch (Exception e) {
                Logger.getLogger(JDialogCadastrarCliente.class.getName()).log(Level.SEVERE, null, e);//erro
            }

        } else {
            Util.dispayMsg("Forneça o número do Apartamento!");
        }
    }

    private void obterPorDescricao() {

        try {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(dadosApts);
            apts = new DaoApartamento().obterPorDescricao(tfDescricao.getText());
            prencherTabela();
        } catch (Exception e) {
            Logger.getLogger(JDialogCadastrarCliente.class.getName()).log(Level.SEVERE, null, e);//erro
            Util.dispayMsg("Erro ao Pesquisar Por Descrição!");

        }
    }

    private void novo() {
        tfDescricao.setText(null);
        tfNumero.setText(null);
        popularTabela();
    }

    private void popularTabela() {
        apts = new DaoApartamento().listar();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(dadosApts);
        prencherTabela();

    }

    private void prencherTabela() {

        model = new DefaultTableModel();
        model.setColumnIdentifiers(dadosApts);

        if (apts != null && !apts.isEmpty()) {
            for (Apartamento apt : apts) {
                model.addRow(new Object[]{apt.getId(),
                    apt.getNumero(),
                    apt.getAndar(),
                    apt.getDescricao()});

            }
            tbApartamento.setModel(model);
        } else {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(dadosApts);
            tbApartamento.setModel(model);
        }
    }

    private void atualizar() {
        if (tbApartamento.getSelectedRow() != -1) {
            if (Util.imprimirConfirmacao("Carregar Dados?")) {
                int linha = tbApartamento.getSelectedRow();
                if (linha == -1) {
                    return;
                }
                Data.hash.put("apartamento", apts.get(linha));
            }
        }

        dispose();
    }

    private void iniciarTabela() {
        apts = new DaoApartamento().listar();
        if (apts != null) {
            prencherTabela();
        }
    }
}
