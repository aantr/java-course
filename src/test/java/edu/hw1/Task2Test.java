package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("Количество цифр")
    void countDigits() {

        assertThat(Task2.countDigits(4666)).isEqualTo(4);
        assertThat(Task2.countDigits(0)).isEqualTo(1);
    }

}
