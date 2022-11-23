package functionalProgramming;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("09876543210"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberHave3).test("09876542210"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("09") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("09") && phoneNumber.length() == 11;

    static Predicate<String> isPhoneNumberHave3 = phoneNumber ->
    phoneNumber.contains("3");
}
