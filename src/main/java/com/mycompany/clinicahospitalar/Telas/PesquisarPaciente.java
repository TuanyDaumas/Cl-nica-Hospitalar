/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.clinicahospitalar.Telas;

import com.mycompany.clinicahospitalar.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuany
 */
public class PesquisarPaciente extends javax.swing.JFrame {
    
    private final ArrayList<Paciente> listaPaciente;

    
    /**
     * Creates new form PesquisarPaciente
     * @param listaPaciente
     */
     public PesquisarPaciente(ArrayList<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
       
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tblPacientesEncontrados = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JToggleButton();
        txtPesquisar = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPacientesEncontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nascimento", "Idade", "Genero", "Cadastro", "Telefone", "Celuelar", "Email", "Res.Tel", "Resp.Cel", "Resp.Email", "Rua", "Numero", "Bairro", "Cidade", "CEP", "Estado", "OBS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPacientesEncontrados);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        // Obtém o nome do paciente digitado pelo usuário
    String nome = txtPesquisar.getText();

    // Verifica se o nome foi fornecido
    if (nome != null && !nome.isEmpty()) {
        // Itera sobre a lista de pacientes em DadosPaciente
        for (Paciente paciente : listaPaciente) {
            // Verifica se o nome do paciente corresponde ao nome fornecido (ignorando maiúsculas/minúsculas)
            if (paciente.getNomeCompleto().equalsIgnoreCase(nome)) {
                // Se o paciente for encontrado, exibe os detalhes do paciente dentro da tabela tblPacientesEncontrados

                // Cria um novo objeto DefaultTableModel para a tabela
                DefaultTableModel modeloTabela = new DefaultTableModel();

                // Adiciona as colunas à tabela
                modeloTabela.addColumn("ID");
                modeloTabela.addColumn("Nome");
                modeloTabela.addColumn("Data de Nascimento");
                modeloTabela.addColumn("Idade");
                modeloTabela.addColumn("Gênero");
                modeloTabela.addColumn("Data de Cadastro");
                modeloTabela.addColumn("Telefone");
                modeloTabela.addColumn("Celular");
                modeloTabela.addColumn("E-mail");
                modeloTabela.addColumn("Telefone do Responsável");
                modeloTabela.addColumn("Celular do Responsável");
                modeloTabela.addColumn("E-mail do Responsável");
                modeloTabela.addColumn("Rua");
                modeloTabela.addColumn("Número");
                modeloTabela.addColumn("Bairro");
                modeloTabela.addColumn("Cidade");
                modeloTabela.addColumn("CEP");
                modeloTabela.addColumn("Estado");
                modeloTabela.addColumn("Observações Gerais");

                // Adiciona os detalhes do paciente à linha da tabela
                Object[] dados = {
                    paciente.getIdPaciente(),
                    paciente.getNomeCompleto(),
                    paciente.getDataNascimento(),
                    paciente.getIdade(),
                    paciente.getGenero(),
                    paciente.getDataCadastro(),
                    paciente.getContato().getTelefone(),
                    paciente.getContato().getCelular(),
                    paciente.getContato().getEmail(),
                    paciente.getContatoResponsavel().getTelefone(),
                    paciente.getContatoResponsavel().getCelular(),
                    paciente.getContatoResponsavel().getEmail(),
                    paciente.getEndereco().getRua(),
                    paciente.getEndereco().getNumero(),
                    paciente.getEndereco().getBairro(),
                    paciente.getEndereco().getCidade(),
                    paciente.getEndereco().getCep(),
                    paciente.getEndereco().getEstado(),
                    paciente.getObsGeral()
                };

                // Adiciona a linha à tabela
                modeloTabela.addRow(dados);

                // Define o modelo de tabela para a tabela tblPacientesEncontrados
                tblPacientesEncontrados.setModel(modeloTabela);

                // Exibe uma mensagem indicando que o paciente foi encontrado
                JOptionPane.showMessageDialog(this, "Paciente encontrado.", 
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                // Encerra o método após encontrar o paciente
                return;
            }
        }
        
        // Se o paciente não for encontrado, exibe uma mensagem de erro
        JOptionPane.showMessageDialog(this, "Paciente não encontrado.", 
                "Erro", JOptionPane.ERROR_MESSAGE);
    } else {
        // Se nenhum nome foi fornecido, exibe uma mensagem de erro
        JOptionPane.showMessageDialog(this, "Por favor, insira o nome do paciente.", 
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
  
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
         // Fechar a tele
        this.dispose();             
    }//GEN-LAST:event_btnSairActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPacientesEncontrados;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
