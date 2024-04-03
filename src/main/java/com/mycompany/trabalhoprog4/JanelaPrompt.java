/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.trabalhoprog4;

/**
 *
 * @author Kaio
 */
public class JanelaPrompt extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaPrompt
     */
    public JanelaPrompt() {
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

        jpEntrada = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFecharSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PromptEntrada = new javax.swing.JTextField();
        jpEnviar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PromptSaida = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(22, 62, 83));
        setName("Prompt"); // NOI18N

        jpEntrada.setBackground(new java.awt.Color(33, 77, 99));
        jpEntrada.setForeground(new java.awt.Color(255, 255, 255));

        btnEnviar.setBackground(new java.awt.Color(44, 92, 115));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(44, 92, 115));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFecharSair.setBackground(new java.awt.Color(44, 92, 115));
        btnFecharSair.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharSair.setText("Fechar e Sair");
        btnFecharSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSairActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrada:");

        javax.swing.GroupLayout jpEntradaLayout = new javax.swing.GroupLayout(jpEntrada);
        jpEntrada.setLayout(jpEntradaLayout);
        jpEntradaLayout.setHorizontalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(btnFecharSair))
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PromptEntrada))
                .addContainerGap())
        );
        jpEntradaLayout.setVerticalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFecharSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromptEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jpEnviar.setBackground(new java.awt.Color(33, 77, 99));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Console:");

        PromptSaida.setEditable(false);
        PromptSaida.setBackground(new java.awt.Color(0, 32, 51));
        PromptSaida.setColumns(20);
        PromptSaida.setForeground(new java.awt.Color(255, 255, 255));
        PromptSaida.setRows(5);
        jScrollPane1.setViewportView(PromptSaida);

        javax.swing.GroupLayout jpEnviarLayout = new javax.swing.GroupLayout(jpEnviar);
        jpEnviar.setLayout(jpEnviarLayout);
        jpEnviarLayout.setHorizontalGroup(
            jpEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnviarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jpEnviarLayout.setVerticalGroup(
            jpEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnviarLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        String Entrada = PromptEntrada.getText();
        String TextoAtual = PromptSaida.getText();
                if (!TextoAtual.isEmpty()) {
                    TextoAtual += "\n"; 
                }
                TextoAtual += Entrada; 
                PromptSaida.setText(TextoAtual);
                PromptEntrada.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        PromptEntrada.setText("");
        PromptSaida.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PromptEntrada;
    private javax.swing.JTextArea PromptSaida;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFecharSair;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpEntrada;
    private javax.swing.JPanel jpEnviar;
    // End of variables declaration//GEN-END:variables
}