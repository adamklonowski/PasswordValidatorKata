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

    @Test
    void shouldNotAcceptPasswordLongerThan20Chars() {

        String passwordLongerThan20Chars = "PasswordLongerThan20Chars";

        boolean result = passwordValidator.validate(passwordLongerThan20Chars);

        Assertions.assertThat(result).isFalse();

    }
    @Test
    void shouldNotAcceptPasswordEqual20Chars() {

        String passwordEqual20Chars = "12345678901234567890";

        boolean result = passwordValidator.validate(passwordEqual20Chars);

        Assertions.assertThat(result).isTrue();

    }
}