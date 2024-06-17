package Telas;
import javax.swing.*;
import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);//cor de fundo
        setSize(new java.awt.Dimension(700, 700));//Tamanho da tela
    }


    private void initComponents() {
        //setExtendedState(MAXIMIZED_BOTH);

        Menu_Button_Vendas = new javax.swing.JButton();
        Menu_Button_CadastrarUsuario = new javax.swing.JButton();
        Menu_Button_Estoque = new javax.swing.JButton();
        Menu_Button_Financeiro = new javax.swing.JButton();
        Menu_Label_Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(500, 500));

        Menu_Button_Vendas.setBackground(new java.awt.Color(255, 171, 0));
        Menu_Button_Vendas.setText("Vendas");
        Menu_Button_Vendas.setMaximumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Vendas.setMinimumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Button_VendasActionPerformed(evt);
            }
        });

        Menu_Button_CadastrarUsuario.setBackground(new java.awt.Color(255, 171, 0));
        Menu_Button_CadastrarUsuario.setText("Cadastrar Usuario");
        Menu_Button_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Button_CadastrarUsuarioActionPerformed(evt);
            }
        });

        Menu_Button_Estoque.setBackground(new java.awt.Color(255, 171, 0));
        Menu_Button_Estoque.setText("Estoque");
        Menu_Button_Estoque.setMaximumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Estoque.setMinimumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Button_EstoqueActionPerformed(evt);
            }
        });

        Menu_Button_Financeiro.setBackground(new java.awt.Color(255, 171, 0));
        Menu_Button_Financeiro.setText("Financeiro");
        Menu_Button_Financeiro.setMaximumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Financeiro.setMinimumSize(new java.awt.Dimension(123, 23));
        Menu_Button_Financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Button_FinanceiroActionPerformed(evt);
            }
        });

        Menu_Label_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("b303917bfa3a3c0181cc0155f44c0c97.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Menu_Button_Financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Menu_Button_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Menu_Button_CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Menu_Button_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(246, 246, 246))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Menu_Label_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Menu_Label_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 342, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addComponent(Menu_Button_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Menu_Button_CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Menu_Button_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Menu_Button_Financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
        );

        pack();
    }

    private void Menu_Button_VendasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame venda = new Venda();
        venda.setVisible(true);
        this.setVisible(false);
    }

    private void Menu_Button_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.setVisible(false);

    }

    private void Menu_Button_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame estoque = new Estoque();
        estoque.setVisible(true);
        this.setVisible(false);
    }

    private void Menu_Button_FinanceiroActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame relatorio = new Relatorio();
        relatorio.setVisible(true);
        this.setVisible(false);
    }


    private javax.swing.JButton Menu_Button_CadastrarUsuario;
    private javax.swing.JButton Menu_Button_Estoque;
    private javax.swing.JButton Menu_Button_Financeiro;
    private javax.swing.JButton Menu_Button_Vendas;
    private javax.swing.JLabel Menu_Label_Img;
}
