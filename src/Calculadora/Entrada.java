package Calculadora;

import javax.swing.*;
import Calculadora.Operacoes;
import static Calculadora.Operacoes.soma;
import static Calculadora.Operacoes.subtracao;
import static Calculadora.Operacoes.multiplicacao;
import static Calculadora.Operacoes.divisao;
import static Calculadora.Respostas.resp;

public class Entrada {

    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado = 0;
        int escolha = 0;
        String opera = "", sinal = "";
        String aux = JOptionPane.showInputDialog(null, "Selecione uma operação\n\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão\n 5-Sair\n\n ");
        escolha = Integer.parseInt(aux);

        switch (escolha) {
            case 1:
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num2 = Double.parseDouble(aux);
                resultado = Operacoes.soma(num1, num2);
                opera = "Soma";
                sinal = "+";
                break;
            case 2:
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num2 = Double.parseDouble(aux);
                resultado = Operacoes.subtracao(num1, num2);
                opera = "Subtração";
                sinal = "-";
                break;
            case 3:
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num2 = Double.parseDouble(aux);
                resultado = Operacoes.multiplicacao(num1, num2);
                opera = "Multiplicação";
                sinal = "*";
                break;
            case 4:
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num1 = Double.parseDouble(aux);
                aux = JOptionPane.showInputDialog(null, "Digite um número");
                aux = aux.replace(",", ".");
                num2 = Double.parseDouble(aux);
                resultado = Operacoes.divisao(num1, num2);
                opera = "Divisão";
                sinal = "/";
                break;
            case 5:
                System.exit(0);
            default:;
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
            System.exit(0);
            break;
        }
        JOptionPane.showMessageDialog(null, "Valores digitados: \n" + num1 + ", " + num2 + "\n\nOperador Selecionado: \n" + opera + "\n\n A " + opera + " de " + num1 + sinal + num2 + " = " + resultado);
    }
}
