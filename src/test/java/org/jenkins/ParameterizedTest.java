package org.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest {
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void parameterizedFailure(int a) {
        Assertions.assertTrue(a < 0);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void parameterizedOkay(int a) {
        Assertions.assertTrue(a > 0);

    }
}
