package Feira;

import javax.swing.*;

public class Exercicio0706 {
    public static void main(String[] args) {
        int salario = 0, desconto = 0, liquido = 0, aliquota = 0;
        String bla = JOptionPane.showInputDialog(null, "Digite seu salário\n\n");
        salario += Integer.parseInt(bla);
        if(salario < 957){
            aliquota = 8;
            liquido = salario-(salario*aliquota/100);
            desconto = salario-liquido;
        }
        if(salario >= 957){
            aliquota = 9;
            liquido = salario-(salario*aliquota/100);
            desconto = salario-liquido;
        }
        if(salario >= 1609){
            aliquota = 11;
            liquido = salario-(salario*aliquota/100);
            desconto = salario-liquido;
            if(desconto > 354){
                desconto = 354;
                liquido = salario - desconto;
            }
        }
        JOptionPane.showMessageDialog(null, "Salário: "+ salario +"\n Salário líquido: "+ liquido +"\n Desconto do salário: "+ desconto +"\n Aliquota: "+ aliquota +"%");
        
    }
}
