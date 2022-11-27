package functionalProgramming.combinatorPattern;

import java.util.function.Function;

public interface custormerRegistrationValidator extends Function<costomer, ValidationResult>{

    static custormerRegistrationValidator isEmailValid(){
        return costomer -> costomer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static custormerRegistrationValidator isPhoneNumberValid(){
        return costomer -> costomer.getPhoneNumber().startsWith("09") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static custormerRegistrationValidator isAdult(){
        return costomer -> Period.between(costomer.getDob(), LocalDate.now()).getYears() > 16 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default custormerRegistrationValidator and (custormerRegistrationValidator other) {
        return costomer -> {
            ValidationResult result = this.apply(costomer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(costomer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}