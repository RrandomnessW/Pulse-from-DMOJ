/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulse;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class PULSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        int count = 0;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            int abc = sc.nextInt();
            if ((abc >= num2) && (abc <= num3)) {
                count = count + 1;
            }
        }
        System.out.println("The number of pulses are: "+count);
    }

}
