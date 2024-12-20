package com.loiane.cursojava.aula15.exerc;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exer3_java {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra : F ou M ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Você digitou um sexo inválido. "
                    + "*** Favor digitar M para Masculino ou F para Feminino ***\n ");
        }
        }

    }