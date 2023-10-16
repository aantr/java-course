package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {

    @Test
    @DisplayName("Циклический битовый сдвиг")
    void cycleShift() {
        assertThat(Task7.rotateRight(8, 1)).isEqualTo(4);
        assertThat(Task7.rotateLeft(5, 1)).isEqualTo(3);
        assertThat(Task7.rotateLeft(17, 2)).isEqualTo(6);
    }

}
