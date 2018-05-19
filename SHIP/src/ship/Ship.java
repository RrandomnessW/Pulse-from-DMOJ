
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.Scanner;

/**
 *
 * @author regan
 */
public class Ship {
    private static Scanner sc=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] parts={'B','F','T','L','C'};
        String partsYouHave=sc.next();
        for(int i=0; i<partsYouHave.length();i++) {
            char part=partsYouHave.charAt(i);
            checkPart(part,parts);
        }
        int count=0;
        for (int i=0;i<parts.length;i++) {
            if (parts[i]!=' ') {
                System.out.println(parts[i]);
                count++;
            }
        }
        if (count==0) {
            System.out.println("No Parts Missing");
        }
        
        
        
    }

    private static void checkPart(char part, char[] parts) {
        for (int i=0;i<parts.length;i++) {
            if(part==parts[i]) {
                parts[i]=' ';
                
            }
        }
    }
 
}


