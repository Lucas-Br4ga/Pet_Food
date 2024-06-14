package Telas;
import java.awt.*;

public class Cadastro extends javax.swing.JFrame {

        public Cadastro() {
            initComponents();
            setLocationRelativeTo(null);
            //getContentPane().setBackground(Color.WHITE);//cor de fundo
            setSize(new java.awt.Dimension(700, 700));//Tamanho da tela
        }


        private void initComponents() {
            Font fontG = new Font("Arial", Font.PLAIN, 27);
            Font fontM = new Font("Arial", Font.PLAIN, 18);

            Cadastro_Label_Titulo = new javax.swing.JLabel();
            Casdastro_Label_Nome = new javax.swing.JLabel();
            Cadastro_TextField_Nome = new javax.swing.JTextField();
            Cadastro_Label_DaataNasc = new javax.swing.JLabel();
            Cadastrar_jTextField_DataNasc = new javax.swing.JTextField();
            Casdastro_Label_Cpf = new javax.swing.JLabel();
            Cadastro_TextField_Cpf = new javax.swing.JTextField();
            Casdastro_Label_ValeTransporte = new javax.swing.JLabel();
            Cadastro_TextField_ValeTransporte = new javax.swing.JTextField();
            Casdastro_Label_ValeAlimentacao = new javax.swing.JLabel();
            Casdastro_TextField_ValeAlimetacao = new javax.swing.JTextField();
            Cadastro_Label_HoraTrabalho = new javax.swing.JLabel();
            Cadastro_TextField_HoraTrabalho = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            Cadastro_Label_Titulo.setForeground(new java.awt.Color(255, 171, 0));
            Cadastro_Label_Titulo.setText("<html><b>Casdastrar Novo Usuário<b><html>");
            Cadastro_Label_Titulo.setToolTipText("");
            Cadastro_Label_Titulo.setFont(fontG);


            Casdastro_Label_Nome.setForeground(new java.awt.Color(255, 171, 0));
            Casdastro_Label_Nome.setText("Nome Completo:");
            Casdastro_Label_Nome.setFont(fontM);

            Cadastro_TextField_Nome.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cadastro_TextField_NomeActionPerformed(evt);
                }
            });

            Cadastro_Label_DaataNasc.setForeground(new java.awt.Color(255, 171, 0));
            Cadastro_Label_DaataNasc.setText("Data de Nascimento:");
            Cadastro_Label_DaataNasc.setFont(fontM);

            Cadastrar_jTextField_DataNasc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cadastrar_jTextField_DataNascActionPerformed(evt);
                }
            });

            Casdastro_Label_Cpf.setForeground(new java.awt.Color(255, 171, 0));
            Casdastro_Label_Cpf.setText("CPF:");
            Casdastro_Label_Cpf.setFont(fontM);

            Cadastro_TextField_Cpf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cadastro_TextField_CpfActionPerformed(evt);
                }
            });

            Casdastro_Label_ValeTransporte.setForeground(new java.awt.Color(255, 171, 0));
            Casdastro_Label_ValeTransporte.setText("Valor de Vale Transporte:");
            Casdastro_Label_ValeTransporte.setFont(fontM);

            Cadastro_TextField_ValeTransporte.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cadastro_TextField_ValeTransporteActionPerformed(evt);
                }
            });

            Casdastro_Label_ValeAlimentacao.setForeground(new java.awt.Color(255, 171, 0));
            Casdastro_Label_ValeAlimentacao.setText("Valor de Vale Alimentação:");
            Casdastro_Label_ValeAlimentacao.setFont(fontM);

            Casdastro_TextField_ValeAlimetacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Casdastro_TextField_ValeAlimetacaoActionPerformed(evt);
                }
            });

            Cadastro_Label_HoraTrabalho.setForeground(new java.awt.Color(255, 171, 0));
            Cadastro_Label_HoraTrabalho.setText("Horário de Trabalho");
            Cadastro_Label_HoraTrabalho.setFont(fontM);

            Cadastro_TextField_HoraTrabalho.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cadastro_TextField_HoraTrabalhoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cadastro_TextField_Nome)
                                            .addComponent(Cadastrar_jTextField_DataNasc)
                                            .addComponent(Cadastro_TextField_Cpf)
                                            .addComponent(Cadastro_TextField_ValeTransporte)
                                            .addComponent(Casdastro_TextField_ValeAlimetacao)
                                            .addComponent(Cadastro_TextField_HoraTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                            .addComponent(Cadastro_Label_HoraTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Casdastro_Label_ValeAlimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Casdastro_Label_ValeTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Casdastro_Label_Cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Cadastro_Label_DaataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Casdastro_Label_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Cadastro_Label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(150, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(Cadastro_Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Casdastro_Label_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Cadastro_TextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastro_Label_DaataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastrar_jTextField_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Casdastro_Label_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastro_TextField_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Casdastro_Label_ValeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastro_TextField_ValeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Casdastro_Label_ValeAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Casdastro_TextField_ValeAlimetacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastro_Label_HoraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cadastro_TextField_HoraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(131, Short.MAX_VALUE))
            );

            pack();
        }

        private void Cadastro_TextField_CpfActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Cadastrar_jTextField_DataNascActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Cadastro_TextField_NomeActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Cadastro_TextField_ValeTransporteActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Cadastro_TextField_HoraTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Casdastro_TextField_ValeAlimetacaoActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }



        private javax.swing.JTextField Cadastrar_jTextField_DataNasc;
        private javax.swing.JLabel Cadastro_Label_DaataNasc;
        private javax.swing.JLabel Cadastro_Label_HoraTrabalho;
        private javax.swing.JLabel Cadastro_Label_Titulo;
        private javax.swing.JTextField Cadastro_TextField_Cpf;
        private javax.swing.JTextField Cadastro_TextField_HoraTrabalho;
        private javax.swing.JTextField Cadastro_TextField_Nome;
        private javax.swing.JTextField Cadastro_TextField_ValeTransporte;
        private javax.swing.JLabel Casdastro_Label_Cpf;
        private javax.swing.JLabel Casdastro_Label_Nome;
        private javax.swing.JLabel Casdastro_Label_ValeAlimentacao;
        private javax.swing.JLabel Casdastro_Label_ValeTransporte;
        private javax.swing.JTextField Casdastro_TextField_ValeAlimetacao;
    }

