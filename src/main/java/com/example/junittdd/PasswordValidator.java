package com.example.junittdd;

public class PasswordValidator {

    public static final int MIN_PASSWORD_LENGHT = 6;

    public boolean validate(String password) {
       return password.length() >= MIN_PASSWORD_LENGHT;

    }
}
