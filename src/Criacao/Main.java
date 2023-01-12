package Criacao;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício da Calcudora ");
        Calculadora.soma(5,9);
        Calculadora.subatracao(9,2.8);
        Calculadora.mutiplicacao(8,9);
        Calculadora.divisao(8,2);

        //Mensagem
        System.out.println("\nExercício da Mensagem ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);

        //Empréstimo
        System.out.println("\nExercício de Emprestímo ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 10);
    }
}
