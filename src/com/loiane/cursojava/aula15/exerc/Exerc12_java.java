package com.loiane.cursojava.aula15.exerc;

import java.util.Scanner;

public class Exerc12_java {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor ganho por hora");
        double valorHora = scan.nextDouble();

        System.out.println("Digite as horas trabalhadas no mês");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = qtdHoras * valorHora;

        int percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto * percentualIR) / 100;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: (R$ "  + valorHora + " * " +qtdHoras + ") : R$ " + salarioBruto );
        System.out.println("(-) IR  (" + percentualIR + "%): R$ " + ir);
        System.out.println("(-) INSS (10%) : R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos : R$ " + totalDescontos);
        System.out.println("Salário liquido: R$ " + salarioLiquido);
    }
}
