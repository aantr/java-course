package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {

    @Test
    @DisplayName("Особый палиндром")
    void specificPalindrome() {
        assertThat(Task5.isPalindromeDescendant(11)).isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(1111)).isEqualTo(true);
    }

}
