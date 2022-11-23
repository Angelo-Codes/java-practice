package arrayOfObject;

import java.util.Scanner;

public class Mains {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("HOw Many Student To Be Registered?");
        int size = s.nextInt();
        s.nextLine();

        Students students[] = new Students[size];

        for(int i = 0; i < students.length; i++){

            String firstName, lastName, course;
            int year;
            char section;

            System.out.println("Student number # " + i);

            System.out.print("First Name : ");
            firstName = s.nextLine();

            System.out.print("Last Name : ");
            lastName = s.nextLine();

            System.out.print("Course Name : ");
            course = s.nextLine();

            System.out.print("Years : ");
            year = s.nextInt();

            System.out.print("Section Name : ");
            section = s.nextLine().charAt(0);

            students[i] = new Students(firstName, lastName, course, year, section);

        }

        for(Students stud: students){
            stud.introduceSelf();
        }
    }
}