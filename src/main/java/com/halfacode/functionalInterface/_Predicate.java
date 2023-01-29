package com.halfacode.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneValid("07000000000"));
        System.out.println(isPhoneValid("09009877300"));
        System.out.println(isPhoneValidPredicate.test("07000000000"));
        System.out.println(isPhoneValidPredicate.test("09009877300"));
        System.out.println(
                "is phone number valid and contin number 3 "+
                isPhoneValidPredicate.and(containsNumber3).test("09009877300"));


    }

    static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }
    static Predicate<String> isPhoneValidPredicate= phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> containsNumber3= phoneNumber->
            phoneNumber.contains("3");
}
