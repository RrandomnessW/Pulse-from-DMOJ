/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ren.ashbell;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class RenAshbell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int RenIsHighest=0;
        
        int n = sc.nextInt();
        int[] manpower = new int[10];
        int i;
        for (i = 0; i < n; i++) {
            manpower[i] = sc.nextInt();
        }

        for (i = 1; i < n; i++) {
            if (manpower[0] > manpower[i]) {
                RenIsHighest = 0;
            } else {
                RenIsHighest = 1;
                break;
            }
        }
        
        if (RenIsHighest == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
