package com.perficient.funtionalprogramming.funtionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String args[]) {
        // using normal function
        System.out.println(isPhoneNumber("07000000000"));
        System.out.println(isPhoneNumber("09000000000"));

        //using predicates
        System.out.println(isPhoneNumberPredicate.test("07000000000"));
        System.out.println(isPhoneNumberPredicate.test("09000000000"));

        //using two predicates in one 
        System.out.println(
                "Is phone number valid and contains number 3 = "
                + isPhoneNumberPredicate.and(containsNumber3Predicate).test("07000000003"));

        System.out.println(
                "Is phone number valid and contains number 3 = "
                + isPhoneNumberPredicate.and(containsNumber3Predicate).test("07000000000"));

    }

    static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("07") & phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberPredicate = phoneNumber
            -> phoneNumber.startsWith("07") & phoneNumber.length() == 11;

    static Predicate<String> containsNumber3Predicate = phoneNumber
            -> phoneNumber.contains("3");

}
