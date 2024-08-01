
package view;

import controller.CargoController;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cargo;


public class frmCargoPesquisar extends javax.swing.JFrame {
    private CargoController cargoController;


    public frmCargoPesquisar() {
        initComponents();
        cargoController = new CargoController();  // Inicializa o controlador
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisarCargo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNovoCargo = new javax.swing.JButton();
        btnAlterarCargo = new javax.swing.JButton();
        btnExcluirCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Cargo");

        txtCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisa de Cargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPesquisarCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisarCargo.setText("Pesquisar");
        btnPesquisarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCargoActionPerformed(evt);
            }
        });

        btnNovoCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNovoCargo.setText("Novo");
        btnNovoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCargoActionPerformed(evt);
            }
        });

        btnAlterarCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterarCargo.setText("Alterar");
        btnAlterarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCargoActionPerformed(evt);
            }
        });

        btnExcluirCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluirCargo.setText("Excluir");
        btnExcluirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnNovoCargo)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarCargo)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCargo)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCargo)
                    .addComponent(btnAlterarCargo)
                    .addComponent(btnExcluirCargo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Descrição", "Situação"
            }
        ));
        jScrollPane1.setViewportView(tblCargos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarCargo)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCargo))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCargoActionPerformed
        // TODO add your handling code here:
        pesquisarCargos();
        
    }//GEN-LAST:event_btnPesquisarCargoActionPerformed

    private void btnAlterarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCargoActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCargos.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tblCargos.getValueAt(selectedRow, 0);
            String nome = (String) tblCargos.getValueAt(selectedRow, 1);
            String descricao = (String) tblCargos.getValueAt(selectedRow, 2);

            frmCargoAlterar frmAlterar = new frmCargoAlterar(this);
            frmAlterar.setCargoData(id, nome, descricao);
            this.setVisible(false);  // Oculta o formulário de pesquisa
            frmAlterar.setVisible(true);  // Mostra o formulário de alteração
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cargo para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarCargoActionPerformed

    private void btnExcluirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCargoActionPerformed
        // TODO add your handling code here:
        // Verifique se um cargo está selecionado na tabela
        int selectedRow = tblCargos.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um cargo para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtenha o ID do cargo selecionado
        int cargoId = (int) tblCargos.getValueAt(selectedRow, 0);

        // Confirme a exclusão
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cargo?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Exclua o cargo usando o CargoController
            try {
                cargoController.deleteCargo(cargoId);
                JOptionPane.showMessageDialog(this, "Cargo excluído com sucesso!");
                // Atualize a tabela após a exclusão
                pesquisarCargos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cargo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirCargoActionPerformed

    private void btnNovoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCargoActionPerformed
        // TODO add your handling code here:
        frmCargoCadastro cargoCadastroView = new frmCargoCadastro(this);
        this.setVisible(false);  // Oculta o formulário de pesquisa
        cargoCadastroView.setVisible(true);
    }//GEN-LAST:event_btnNovoCargoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCargoPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCargoPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCargoPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCargoPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCargoPesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCargo;
    private javax.swing.JButton btnExcluirCargo;
    private javax.swing.JButton btnNovoCargo;
    private javax.swing.JButton btnPesquisarCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCargos;
    private javax.swing.JTextField txtCargo;
    // End of variables declaration//GEN-END:variables

    public void pesquisarCargos() {
        String nome = txtCargo.getText();

        try {
            List<Cargo> cargos = cargoController.searchCargosByName(nome);
            DefaultTableModel model = (DefaultTableModel) tblCargos.getModel();
            model.setRowCount(0);  // Limpa a tabela antes de adicionar os resultados

            for (Cargo cargo : cargos) {
                model.addRow(new Object[]{cargo.getId(), cargo.getNome(), cargo.getDescricao()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar cargos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
