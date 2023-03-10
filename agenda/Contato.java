package br.com.newton.agenda;

import javax.swing.*;

public class Contato {
    private String nome;
    private String numero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero(String numero) {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    ///Criar um método excluir que não tem retorno e que receba como parametro um contato a ser excluído
    // Escrever uma mensagem " Excluindo o coontato nome do contato

    public void excluir(Contato contato) {
        System.out.println("Excluindo o contato " + contato.nome);
    }

    public void incluir( Contato contato){
        System.out.println("Incluir contato " +contato.numero);

    }

    public static class Telefone {
        public static void main(String[] args) {
            Contato contato = new Contato();
            String nome = JOptionPane.showInputDialog("Informe o seu nome:");
            contato.setNome(nome);
            String numero = JOptionPane.showInputDialog("Informe o seu número de telefone:" );
            contato.setNumero(numero);
            if ( contato.getNumero(numero).length() < 9){
                JOptionPane.showMessageDialog(null, "Número inválido, digite um novo numero: ",
                        "teste", JOptionPane.QUESTION_MESSAGE);
                contato.excluir(contato);
                nome = JOptionPane.showInputDialog("Informe o seu nome:");
                contato.setNome(nome);
                numero = JOptionPane.showInputDialog("Informe o seu número de telefone:" );
                contato.setNumero(numero);
                contato.incluir(contato);
            }

        }

    }
}
