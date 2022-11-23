package arrayOfObject;

public class Students {

    private String firstName, lastName;
    private String course;
    private int year;
    private char section;

    Students(String firstName, String lastName, String course, int year, char section){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
    }

    void introduceSelf(){
        System.out.println("full Name : " + firstName + " " + lastName);
        //BSIT - 1E
        System.out.println("C/Y/S : " + course + " - " + year + section);
    }
    
}
