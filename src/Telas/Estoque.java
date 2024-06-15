package Telas;


import java.awt.Font;

public class Estoque extends javax.swing.JFrame {

    public Estoque() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(950, 500));
    }


    private void initComponents() {
        Font fontG = new Font("Arial", Font.PLAIN, 27);
        Estoque_Label_EstoquePet = new javax.swing.JLabel();
        Estoque_TextField_Pesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Estoque_Table_Protudos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Estoque_Label_EstoquePet.setForeground(new java.awt.Color(255, 171, 0));
        Estoque_Label_EstoquePet.setText("Estoque PetFood");
        Estoque_Label_EstoquePet.setFont(fontG);


        Estoque_TextField_Pesquisar.setText("Pesquisar...");
        Estoque_TextField_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estoque_TextField_PesquisarActionPerformed(evt);
            }
        });

        Estoque_Table_Protudos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "CÓDIGO", "PRODUTO", "PREÇO", "PREÇO DE CUSTO", "QUANTIDADE"
                }
        ));
        jScrollPane1.setViewportView(Estoque_Table_Protudos);
        if (Estoque_Table_Protudos.getColumnModel().getColumnCount() > 0) {
            Estoque_Table_Protudos.getColumnModel().getColumn(0).setHeaderValue("CÓDIGO");
            Estoque_Table_Protudos.getColumnModel().getColumn(1).setHeaderValue("PRODUTO");
            Estoque_Table_Protudos.getColumnModel().getColumn(2).setHeaderValue("PREÇO");
            Estoque_Table_Protudos.getColumnModel().getColumn(3).setHeaderValue("PREÇO DE CUSTO");
            Estoque_Table_Protudos.getColumnModel().getColumn(4).setHeaderValue("QUANTIDADE");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Estoque_TextField_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Estoque_Label_EstoquePet, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Estoque_Label_EstoquePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(Estoque_TextField_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }

    private void Estoque_TextField_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private javax.swing.JLabel Estoque_Label_EstoquePet;
    private javax.swing.JTable Estoque_Table_Protudos;
    private javax.swing.JTextField Estoque_TextField_Pesquisar;
    private javax.swing.JScrollPane jScrollPane1;
}

