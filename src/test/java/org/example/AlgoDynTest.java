package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AlgoDynTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 15})
    void compare(int day) {
        // given:
        int[] startNumbers = { 21, 1, 20, 23 };
        // when:
        int expected = AlgoDyn.chooseHobbyIterative(startNumbers, day);
        int actual = AlgoDyn.chooseHobbyRecursive(startNumbers, day, new int[day]);
        // then:
        assertEquals(expected, actual);
    }

}