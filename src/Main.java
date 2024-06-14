import Telas.*;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame login = new Login();
        login.setVisible(true);
        JFrame menu = new Menu();
        menu.setVisible(true);
        JFrame cadastro = new Cadastro();
        cadastro.setVisible(true);
        JFrame venda = new Venda();
        venda.setVisible(true);
        JFrame relatorio = new Relatorio();
        relatorio.setVisible(true);
        JFrame estoque = new Estoque();
        estoque.setVisible(true);
    }
}