package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {

    @Test
    @DisplayName("Постоянная Капрекара")
    void kaprekar() {
        assertThat(Task6.kaprekar(3524)).isEqualTo(3);
    }

}
