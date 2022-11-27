package functionalProgramming.combinatorPattern;

import java.time.LocalDate;

import functionalProgramming.combinatorPattern.custormerRegistrationValidator.ValidationResult;

public class CustomerMain {
    public static void main(String[] args) {
        customer costomer = new customer("alice", "alice@gmail.com", "0987654321", LocalDate.of(2000, 8, 7));

        ValidationResult result = custormerRegistrationValidator
        .isEmailValid()
        .and(custormerRegistrationValidator.isPhoneNumberValid())
        .and(custormerRegistrationValidator.isAdult())
        .apply(costomer);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        };
    }
}
