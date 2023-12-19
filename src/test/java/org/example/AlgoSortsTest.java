package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoSortsTest {

    @Test
    void mergeAll() {
        // given:
        int[][] teams = {{45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}};
        int[] expected = {51, 45, 31, 31, 30, 24, 22, 20, 18, 17};
        // when:
        int[] actual = AlgoSorts.mergeAll(teams);
        // then:
        assertArrayEquals(expected, actual);
    }

}