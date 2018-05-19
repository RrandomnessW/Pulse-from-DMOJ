/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.work;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class HOMEWORK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int large = Integer.MIN_VALUE;
        int num = 0;

       for (int i=0; i<n; i++) {
        num = sc.nextInt();
           if (num>large) {
           large = num;
       }
    }

       System.out.println(large);


}
        

        // int[] intArray = new int[10]; int n = sc.nextInt();for (int i = 0; i < n; i++) {intArray[i] = sc.nextInt();if (intArray[i] > intArray[i+1]) {System.out.print(i);};
        //intArray[0] = 1;intArray[1] = 2;
        //for (int i = 2; i < intArray.length; i++) {intArray[i] = intArray[i - 2] + intArray[i - 1];
    }

}
