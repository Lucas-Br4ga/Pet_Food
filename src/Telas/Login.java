package Telas;

import javax.swing.border.AbstractBorder;
import java.awt.*;

    public class Login extends javax.swing.JFrame {

        public Login() {
            initComponents();
            setLocationRelativeTo(null);//centraliza
            //getContentPane().setBackground(Color.BLACK);//cor de fundo
            setSize(new java.awt.Dimension(700, 700));//Tamanho da tela
            //setExtendedState(MAXIMIZED_BOTH);//tela cheia
        }


        private void initComponents() {

            buttonGroup1 = new javax.swing.ButtonGroup();
            Login_Label_Img = new javax.swing.JLabel();
            Login_TextField_Usuario = new javax.swing.JTextField();
            Login_PasswordField_Senha = new javax.swing.JPasswordField();
            Login_ToggleButton_EsquiciSenha = new javax.swing.JToggleButton();
            Login_Label_Usuario = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            Login_Label_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("b303917bfa3a3c0181cc0155f44c0c97.jpg"))); // NOI18N

            Login_TextField_Usuario.setBackground(new java.awt.Color(255, 171, 0));
            Login_TextField_Usuario.setOpaque(true);
            Login_TextField_Usuario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Login_TextField_UsuarioActionPerformed(evt);
                }
            });

            Login_PasswordField_Senha.setBackground(new java.awt.Color(255, 171, 0));

            Login_ToggleButton_EsquiciSenha.setText("Esquici minha senha");
            Login_ToggleButton_EsquiciSenha.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Login_ToggleButton_EsquiciSenhaActionPerformed(evt);
                }
            });

            Login_Label_Usuario.setText("Login:");

            jLabel2.setText("Senha:");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(228, 228, 228)
                                                    .addComponent(Login_ToggleButton_EsquiciSenha))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(91, 91, 91)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGap(23, 23, 23)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel2)
                                                                            .addComponent(Login_Label_Usuario))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(Login_TextField_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                                                            .addComponent(Login_PasswordField_Senha)))
                                                            .addComponent(Login_Label_Img))))
                                    .addGap(107, 107, 107))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(Login_Label_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Login_TextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Login_Label_Usuario))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Login_PasswordField_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                    .addGap(32, 32, 32)
                                    .addComponent(Login_ToggleButton_EsquiciSenha)
                                    .addContainerGap(35, Short.MAX_VALUE))
            );

            pack();
        }

        private void Login_TextField_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void Login_ToggleButton_EsquiciSenhaActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }



        private javax.swing.JLabel Login_Label_Img;
        private javax.swing.JLabel Login_Label_Usuario;
        private javax.swing.JPasswordField Login_PasswordField_Senha;
        private javax.swing.JTextField Login_TextField_Usuario;
        private javax.swing.JToggleButton Login_ToggleButton_EsquiciSenha;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JLabel jLabel2;
    }

