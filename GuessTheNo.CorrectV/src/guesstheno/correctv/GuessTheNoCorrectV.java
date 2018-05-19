/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesstheno.correctv;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class GuessTheNoCorrectV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int n = rand.nextInt(15) + 1;
        int[] sequence = new int[n];

        generateSequenceData(sequence);
        guessTheSequence(sequence);
        System.out.println("DONE");
    }

    private static void generateSequenceData(int[] sequence) {
        Random rand = new Random();
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = rand.nextInt(3) + 1;

        }
    }

    private static void guessTheSequence(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            askUserGuessData(sequence[i]);
        }
    }

    private static void askUserGuessData(int data) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            a = inputInteger1To3();
            if (a == data) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } while (a == data);

    }

    private static int inputInteger1To3() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = sc.nextInt();
                if (n < 1 || n > 3) {
                    System.out.print("the integer should be between 1 and 3:");
                } else {
                    return n;
                }

            } catch (Exception e) {
                sc.next();
                System.out.print("Input wrong. Please input an integer:");
            }

        }
    }
}
