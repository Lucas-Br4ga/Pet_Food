package Telas;

import java.awt.*;

    public class Venda extends javax.swing.JFrame {

        public Venda() {
            initComponents();
            setLocationRelativeTo(null);
            setSize(new java.awt.Dimension(950, 500));
            getContentPane().setBackground(Color.BLACK);
        }


        @SuppressWarnings("unchecked")
        private void initComponents() {
            Font fontG = new Font("Arial", Font.PLAIN, 27);
            Font fontP = new Font("Arial", Font.PLAIN, 15);
            Venda_Label_Titulo = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            Venda_Table_Tabela = new javax.swing.JTable();
            Venda_ComboBox_FormaPagamento = new javax.swing.JComboBox<>();
            Venda_Button_Finalizar = new javax.swing.JButton();
            Venda_TextField_Pesquisar = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            Venda_Label_Usuario = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            Venda_Label_Titulo.setForeground(new java.awt.Color(255, 171, 0));
            Venda_Label_Titulo.setText("Venda PetFoot");
            Venda_Label_Titulo.setFont(fontG);

            Venda_Table_Tabela.setBackground(new java.awt.Color(0, 0, 0));
            Venda_Table_Tabela.setForeground(new java.awt.Color(255, 255, 255));
            Venda_Table_Tabela.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null}
                    },
                    new String [] {
                            "PRODUTO", "QUANTIDADE", "VALOR UNITÁRIO", "VALOR TOTAL"
                    }
            ));
            Venda_Table_Tabela.setGridColor(new java.awt.Color(255, 171, 0));
            Venda_Table_Tabela.setSelectionBackground(new java.awt.Color(255, 255, 255));
            Venda_Table_Tabela.setSelectionForeground(new java.awt.Color(255, 255, 255));
            jScrollPane2.setViewportView(Venda_Table_Tabela);

            Venda_ComboBox_FormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão Debito", "Cartão Credito", "PIX" }));

            Venda_Button_Finalizar.setBackground(new java.awt.Color(255, 171, 0));
            Venda_Button_Finalizar.setText("FINALIZAR VENDA");
            Venda_Button_Finalizar.setFont(fontP);

            Venda_TextField_Pesquisar.setText("Pesquisar...");

            jLabel1.setForeground(new java.awt.Color(242, 242, 242));
            jLabel1.setText("Usuário:");

            Venda_Label_Usuario.setForeground(new java.awt.Color(242, 242, 242));
            Venda_Label_Usuario.setText("Nao sei");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addContainerGap(380, Short.MAX_VALUE)
                                                    .addComponent(Venda_Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(85, 85, 85)
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Venda_Label_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Venda_TextField_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(Venda_Button_Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(386, 386, 386))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(Venda_ComboBox_FormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(411, 411, 411))))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Venda_Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel1)
                                                    .addComponent(Venda_Label_Usuario)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Venda_TextField_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Venda_ComboBox_FormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                    .addComponent(Venda_Button_Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
            );

            Venda_Label_Usuario.getAccessibleContext().setAccessibleName("");

            pack();
        }


        private javax.swing.JButton Venda_Button_Finalizar;
        private javax.swing.JComboBox<String> Venda_ComboBox_FormaPagamento;
        private javax.swing.JLabel Venda_Label_Titulo;
        private javax.swing.JLabel Venda_Label_Usuario;
        private javax.swing.JTable Venda_Table_Tabela;
        private javax.swing.JTextField Venda_TextField_Pesquisar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane2;
    }

