package com.loiane.cursojava.aula15.exerc;
import java.util.Scanner;

public class Exerc6_java {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.println("Entre com o terceiro número: ");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número digitado foi: " + numero1);
        } else if   (numero2 > numero1 && numero2 > numero3) {
            System.out.println ("O maior número digitado foi: " + numero2);{

            }
        }


        }
}



