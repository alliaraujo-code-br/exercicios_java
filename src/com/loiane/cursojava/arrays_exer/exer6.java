package com.loiane.cursojava.arrays_exer;

import java.util.Scanner;

public class exer6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do vetor B da posição: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Vetor A = : ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = : ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor C = : ");
        for (int i=0; i<vetorC.length; i++){
            System.out.println(vetorC[i] + " ");
        }
        System.out.println();
    }
}