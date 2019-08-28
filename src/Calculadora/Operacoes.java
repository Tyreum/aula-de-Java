package Calculadora;

import javax.swing.*;
import Calculadora.Entrada;

static double resultado = 0;

public class Operacoes {
    public static double soma(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public static double subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public static double multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public static double divisao(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
