package Feira;

import javax.swing.*;

public class Exercicio0707 {

    public static void main(String[] args) {
        double peso = 0, altura = 0, IMC = 0;
        try{
        String aux = JOptionPane.showInputDialog(null, "Qual o seu peso?\n\n");
        peso = Double.parseDouble(aux);
        if (peso < 0.5) {
            JOptionPane.showMessageDialog(null, "O valor inserido é inválido!");
        }
        aux = JOptionPane.showInputDialog(null, "Qual sua altura?\n\n");
        altura = Double.parseDouble(aux);
        if (altura < 0.1){
            JOptionPane.showMessageDialog(null, "O valor inserido é inválido!");
        }
        IMC = peso / (altura * altura);
        if (IMC < 18.5){
            JOptionPane.showMessageDialog(null, "Você está com excesso de Magreza!");
        }
        if (IMC < 25 && IMC > 18.5){
            JOptionPane.showMessageDialog(null, "Você está com o peso Normal!");
        }
        if (IMC < 30 && IMC > 25){
            JOptionPane.showMessageDialog(null, "Você está com excesso de Peso!");
        }
        if (IMC < 35 && IMC > 30){
            JOptionPane.showMessageDialog(null, "Você está Obeso(Grau I)!");
        }
        if (IMC < 40 && IMC > 35){
            JOptionPane.showMessageDialog(null, "Você está Obeso(Grau II)!");
        }
        if (IMC > 40){
            JOptionPane.showMessageDialog(null, "Você está Obeso(Grau III)!");
        }
      }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Moço, só número, pf ^v^");
    }
  }
}
