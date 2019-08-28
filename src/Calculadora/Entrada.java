package Calculadora;

import javax.swing.*;
import Calculadora.Operacoes;
import static Calculadora.Operacoes.soma;
import static Calculadora.Operacoes.subtracao;
import static Calculadora.Operacoes.multiplicacao;
import static Calculadora.Operacoes.divisao;

public class Entrada {

    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        int escolha = 0;
        String aux = JOptionPane.showInputDialog(null, "Selecione uma operação\n\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão\n\n");
        escolha = Integer.parseInt(aux);

        switch (escolha) {
            case 1: aux = JOptionPane.showInputDialog(null,"Digite um número");
                    num1 = Double.parseDouble(aux);
                    aux = JOptionPane.showInputDialog(null,"Digite um número");
                    num2 = Double.parseDouble(aux);
                    soma(num1, num2);
                    JOptionPane.showMessageDialog(null, resultado);
                break;
            case 2:;
                break;
            case 3:;
                break;
            case 4:;
                break;

        }
    }

}
