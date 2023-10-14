package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    @Test
    @DisplayName("Вложенный массив")
    void includedArray() {
        assertThat(Task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6})).isEqualTo(true);
        assertThat(Task3.isNestable(new int[]{9, 9, 8}, new int[] {8, 9})).isEqualTo(false);
    }

}
