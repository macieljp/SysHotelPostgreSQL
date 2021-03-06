/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.dao.DaoEstado;
import br.edu.utfpr.cm.pi.modal.Estado;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastrarEstado extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarEstado
     */
    public JDialogCadastrarEstado(java.awt.Frame parent, boolean modal) {
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
        jSeparatorSepCadEstado = new javax.swing.JSeparator();
        tfCod = new javax.swing.JTextField();
        jLabelCadEstadoCodigo = new javax.swing.JLabel();
        jLabelCadestadoNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jSeparator2CadEstado = new javax.swing.JSeparator();
        jButtonCadEstadSalvar = new javax.swing.JButton();
        jButtonCadEstadLimpar = new javax.swing.JButton();
        jButtonCadEstadApagar = new javax.swing.JButton();
        jButtonCadEstadFechar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(559, 280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/CadEstado_1.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(750, 80));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 270, 60));

        jSeparatorSepCadEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jSeparatorSepCadEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 5));

        tfCod.setEditable(false);
        tfCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfCod.setToolTipText("");
        getContentPane().add(tfCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 30));

        jLabelCadEstadoCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadEstadoCodigo.setText("Código:");
        getContentPane().add(jLabelCadEstadoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabelCadestadoNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadestadoNome.setText("Nome:");
        getContentPane().add(jLabelCadestadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        tfNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        jSeparator2CadEstado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jSeparator2CadEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 752, -1));

        jButtonCadEstadSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCadEstadSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/save01.png"))); // NOI18N
        jButtonCadEstadSalvar.setToolTipText("Salvar");
        jButtonCadEstadSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEstadSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadEstadSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jButtonCadEstadLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadEstadLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonCadEstadLimpar.setToolTipText("Limpar");
        jButtonCadEstadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEstadLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadEstadLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jButtonCadEstadApagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCadEstadApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/trash.png"))); // NOI18N
        jButtonCadEstadApagar.setToolTipText("Apagar");
        jButtonCadEstadApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEstadApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadEstadApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jButtonCadEstadFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonCadEstadFechar.setToolTipText("Fechar");
        jButtonCadEstadFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEstadFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadEstadFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Add.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 30, 30));

        setSize(new java.awt.Dimension(575, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadEstadFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstadFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCadEstadFecharActionPerformed

    private void jButtonCadEstadSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstadSalvarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Salvar?")) {
            salvar();
        }
    }//GEN-LAST:event_jButtonCadEstadSalvarActionPerformed

    private void jButtonCadEstadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstadLimparActionPerformed
        if (Util.imprimirConfirmacao("Deseja Limpar?")) {
            novo();
        }
    }//GEN-LAST:event_jButtonCadEstadLimparActionPerformed

    private void jButtonCadEstadApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstadApagarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Deletar?")) {
            remover();
        }
    }//GEN-LAST:event_jButtonCadEstadApagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        obter();
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCadEstadApagar;
    private javax.swing.JButton jButtonCadEstadFechar;
    private javax.swing.JButton jButtonCadEstadLimpar;
    private javax.swing.JButton jButtonCadEstadSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadEstadoCodigo;
    private javax.swing.JLabel jLabelCadestadoNome;
    private javax.swing.JSeparator jSeparator2CadEstado;
    private javax.swing.JSeparator jSeparatorSepCadEstado;
    private javax.swing.JTextField tfCod;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
    protected Session session;

    private void novo() {
        tfCod.setText(null);
        tfNome.setText(null);

    }

    private void salvar() {
        if (valido()) {
            Estado estado = new Estado();
            if (!tfCod.getText().isEmpty()) {  //verifica se o campo Codigo esta vazio
                estado.setId(Integer.parseInt(tfCod.getText()));
            }
            estado.setNome(tfNome.getText().trim());

            try {
                new DaoEstado().persistir(estado);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            novo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    private void remover() {
        if (!tfCod.getText().isEmpty()) {
            int id = Integer.parseInt(tfCod.getText().trim());
            try {
                DaoEstado dao = new DaoEstado();
                dao.remover(dao.obterPorId(id));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            novo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionando !");
        }
    }

    private boolean valido() {
        if (!tfNome.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private void obter() {
        JDialog dialog = new JDialogPesqEstado(null, true);
        Util.abrirJDialogCentralizado(dialog);
        if (Data.hash.get("estado") == null) {
            return;
        } else {
            if (Data.hash.get("estado") instanceof Estado) {
                Estado estado = (Estado) Data.hash.get("estado");
                Data.hash.remove("estado");
                if (estado == null) {
                    return;
                }
                tfCod.setText(String.valueOf(estado.getId()));
                tfNome.setText(estado.getNome());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um Estado.");
                Data.hash.remove("estado");//limpra o conteudo do map
            }
        }

    }
}