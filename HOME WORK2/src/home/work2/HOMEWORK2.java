/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.work2;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class HOMEWORK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int num = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num > large) {
                large = num;
            }
            if (num < small) {
                small = num;
            }
            sum = sum + num;
            
            }
        
        System.out.println("MAX ="+large);
        System.out.println("MIN ="+small);
        System.out.println("SUM ="+sum);
        System.out.println("AVERAGE ="+(double)sum/(double)n);//double makes integer into double
    }
}

