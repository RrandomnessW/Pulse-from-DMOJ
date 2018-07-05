/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notfalsetrue;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class NOTFALSETRUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int result = 1;

        String s = sc.nextLine();
        String[] a = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo("not") == 0) {
                result = result * -1;
            } else if (a[i].compareTo("true") == 0) {
                result = result * 1;
            } else if (a[i].compareTo("false") == 0) {
                result = result * -1;
            }
        }
        if (result == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
