package com.junitbasics.main;

import java.util.regex.Pattern;

public class ContactValidations {

    private boolean hasStr5CharsMin(String str) {
        return str.length() >= 5;
    }

    private boolean doesItContainOnlyDigits(String str) {
        return Pattern.matches("[0-9]{10}", str);
    }

    public void nameCheck(String str) {
        if(!hasStr5CharsMin(str)) {
            throw new RuntimeException("It failed");
        }

    }

    public void phoneNumberCheck(String str) {
        if (str.length() == 0) {
            throw new RuntimeException("Phone number is null");
        }
        if (!doesItContainOnlyDigits(str)) {
            throw new RuntimeException("Phone number format is wrong");
        }
    }

}
