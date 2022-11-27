package functionalProgramming.combinatorPattern;

import java.time.LocalDate;

public class customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    customer(String name, String email, String phoneNumber, LocalDate dob){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public LocalDate getDob(){
        return dob;
    }
}
