package functionalProgramming.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;


public class customerValicatorService {
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("09");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }
    public boolean isValid(customer costomer){
        return isEmailValid(costomer.getEmail()) &&
        isPhoneNumberValid(costomer.getPhoneNumber()) &&
        isAdult(costomer.getDob());
    }
}