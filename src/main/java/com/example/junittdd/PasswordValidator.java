package com.example.junittdd;

public class PasswordValidator {

    public static final int MIN_PASSWORD_LENGHT = 6;
    public static final int MAX_PASSWORD_LENGHT = 20;

    public boolean validate(String password) {
       return password.length() <= MAX_PASSWORD_LENGHT &&
              password.length() >= MIN_PASSWORD_LENGHT;

    }
}

