package com.loiane.cursojava.aula15.exerc;

import java.util.Scanner;

public class Exer4_java {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println(" Digite uma letra para iniciar aplicação");
        String letra = scan.next();
//
////        if (letra.equalsIgnoreCase("a")
////                || letra.equalsIgnoreCase("e")
////                || letra.equalsIgnoreCase("i")
////                || letra.equalsIgnoreCase("o")
////                || letra.equalsIgnoreCase("u")){
////            System.out.println("Você digitou a vogal : " + letra);
////        }   else {
////            System.out.println("Você digitou a consoante: " + letra);
////        }
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("Você digitou a vogal : " + letra); break;
            default: System.out.println("Você digitou a consoante: " + letra);

        }


    }
}


