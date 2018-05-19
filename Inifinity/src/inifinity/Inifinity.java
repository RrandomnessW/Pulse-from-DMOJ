/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inifinity;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class Inifinity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(16);
        int b = in.nextInt(16);

        if (a + b >= 0x3f3f3f3f) {

            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
