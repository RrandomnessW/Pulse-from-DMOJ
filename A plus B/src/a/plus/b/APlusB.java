/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.plus.b;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class APlusB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt(); //number of addition problems you need to do
        for (int i = 0; i < N; i++) {//this is the for loop, i is 0 and is smaller than n, when it is smaller than N, you repeat the loop, lets you do the number of questions
            int a = in.nextInt();// first to add
            int b = in.nextInt();// second number to add
            System.out.println(a + b); //this writes the answer 
        }
    }
    
}
