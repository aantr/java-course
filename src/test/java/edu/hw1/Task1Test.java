package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {

    @Test
    @DisplayName("Длина видео")
    void minutesToSeconds() {
        String string1 = "10:60";
        String string2 = "12:12";

        assertThat(Task1.minutesToSeconds(string1)).isEqualTo(-1);
        assertThat(Task1.minutesToSeconds(string2)).isEqualTo(12 * 60 + 12);
    }

}
