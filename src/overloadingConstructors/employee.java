package overloadingConstructors;

public class employee {
    private String firstName, lastName;
    private String title, address, sex;

    private int age;

    employee(){
        address = "N/A";
        sex = "N/A";
        title = "N/A";
        firstName = "N/A";
        lastName = "N/A";
        age = 0;
    }

    employee(String firstName, String lastName, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    employee(String firsName,
             String lastName,
             String title,
             String address,
             String sex,
             int age)
    {
        this.firstName = firsName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    void setFisrtName(String firsName, int age){
        this.firstName = firsName;
        this.age = age;
    }

    String getFirstName(){return firstName;}
}
