package com.example.junittdd;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void shouldAcceptPasswordLongerThanSixChars() {
        String passwordToCheck = "1234567";

        boolean result = passwordValidator.validate(passwordToCheck);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldNotAcceptPasswordShorterThanSixChars() {

        String passwordToCheck = "1234";

        boolean result = passwordValidator.validate(passwordToCheck);

        Assertions.assertThat(result).isFalse();

    }
}