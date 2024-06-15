package Telas;

import java.awt.Color;
import java.awt.Font;

public class Relatorio extends javax.swing.JFrame {

    public Relatorio() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(950, 500));
        getContentPane().setBackground(Color.BLACK);//cor de fundo
    }

    private void initComponents() {
        Font fontG = new Font("Arial", Font.PLAIN, 27);
        Relatorio_Label_RelatorioFinanceiro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Relatorio_Table_RelatorioFinaceiro = new javax.swing.JTable();
        Relatorio_Label_Diaria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Relatorio_Table_Diaria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Relatorio_Label_RelatorioFinanceiro.setForeground(new java.awt.Color(255, 171, 0));
        Relatorio_Label_RelatorioFinanceiro.setText("Relatório Financeiro");
        Relatorio_Label_RelatorioFinanceiro.setMaximumSize(new java.awt.Dimension(109, 16));
        Relatorio_Label_RelatorioFinanceiro.setMinimumSize(new java.awt.Dimension(109, 16));
        Relatorio_Label_RelatorioFinanceiro.setFont(fontG);

        Relatorio_Table_RelatorioFinaceiro.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Usuário responsável", "Data da venda", "Valor total", "PIX", "Dinheiro", "Cartão de crédito", "Cartão de débito"
                }
        ));
        jScrollPane1.setViewportView(Relatorio_Table_RelatorioFinaceiro);

        Relatorio_Label_Diaria.setForeground(new java.awt.Color(255, 171, 0));
        Relatorio_Label_Diaria.setText("Venda Diária de João");
        Relatorio_Label_Diaria.setPreferredSize(new java.awt.Dimension(100, 16));
        Relatorio_Label_Diaria.setFont(fontG);

        Relatorio_Table_Diaria.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Usuário responsável", "Valor total", "PIX", "Dinheiro", "Cartão de crédito", "Cartão de débito"
                }
        ));
        jScrollPane2.setViewportView(Relatorio_Table_Diaria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Relatorio_Label_RelatorioFinanceiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Relatorio_Label_Diaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Relatorio_Label_RelatorioFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Relatorio_Label_Diaria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }

    private javax.swing.JLabel Relatorio_Label_Diaria;
    private javax.swing.JLabel Relatorio_Label_RelatorioFinanceiro;
    private javax.swing.JTable Relatorio_Table_Diaria;
    private javax.swing.JTable Relatorio_Table_RelatorioFinaceiro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
}
