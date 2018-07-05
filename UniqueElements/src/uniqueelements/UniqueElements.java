/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniqueelements;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2018-07-02
 * Today we learned about array list and the commands you can make with an array list
 * @author ryanj
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[1000];

        ArrayList<Integer> ar2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (ar2.contains(ar[i]) == false) {
                ar2.add(ar[i]);
            }
        }

        System.out.println("No. of distinct number is: " + ar2.size());

    }
}
