package org.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void okay() {
        assertTrue(true || false);
        Assertions.assertAll(() -> { }, () -> {});
    }

    @Test
    public void multipleFailure() {
        Assertions.assertAll(
                () -> assertTrue(true),
                () -> assertTrue(true && false),
                () -> assertTrue(1 - 1 > 0)
        );
    }
}
