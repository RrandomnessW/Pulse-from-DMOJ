/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class Students2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] sts = new Student[5];
        File file = new File("C:\\Users\\ryanj\\OneDrive\\Document\\students.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
        } catch (Exception e) {
            return null;
        }
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.deserialize(sc.nextLine());
            Student student = new Student();
            student.id = Integer.parseInt(sc.nextLine());
            student.name = sc.nextLine();
            student.age = Integer.parseInt(sc.nextLine());
            student.gender = sc.nextLine().charAt(0);
            student.school = sc.nextLine();
            student.program = sc.nextLine();
            student.nationality = sc.nextLine();
            sts[i] = student;

        }
        return sts;

    }

    private static Student findStudentWithId(int id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

    static Student[] students;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        students = readStudentsFromFile();
        if (students == null) {
            System.out.println("File is not found");
            return;
        }
        int id = Integer.parseInt(sc.nextLine());
        while (id > 0) {
            Student student = findStudentWithId(id);
            if (student == null) {
                System.out.println("t=The id is not correct.Please input integer from 1 to 5");
            } else {
                student.printInfo();
            }
            id = Integer.parseInt(sc.nextLine());

        }
    }

}
    }
    
}
