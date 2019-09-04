package Calculadora;

import javax.swing.*;
import Calculadora.Entrada;

public class Operacoes {
    

    public static double soma(double num1, double num2) {
        return (num1 + num2);
    }

    public static double subtracao(double num1, double num2) {
        return (num1 - num2);
    }

    public static double multiplicacao(double num1, double num2) {
        return (num1 * num2);
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Erro!");
            System.exit(0);
        }
        return (num1 / num2);
    }
}

