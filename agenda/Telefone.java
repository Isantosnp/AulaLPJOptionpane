package br.com.newton.agenda;

import javax.swing.*;

public class Telefone {
    public static void main(String[] args) {
        Contato contato = new Contato();
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        contato.setNome(nome);
        String numero = JOptionPane.showInputDialog("Informe o seu nome: ");
        contato.setNumero(numero);
        if ( contato.getNumero(numero).length() != 9){
            JOptionPane.showMessageDialog(null, "Numero de telefone inválido digite um novo numero: ",
                    "teste", JOptionPane.QUESTION_MESSAGE);
            contato.excluir(contato);
             nome = JOptionPane.showInputDialog("Informe o seu nome: ");
            contato.setNome(nome);
            numero = JOptionPane.showInputDialog("Informe o seu nome: ");
            contato.setNumero(numero);
            contato.incluir(contato);
        }
    }
}
