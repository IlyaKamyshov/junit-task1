package org.example;

import java.io.*;
import java.util.Arrays;

public class AlgoSorts {

    public static void main(String[] args) throws IOException {
        int[][] teams = {{45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}};

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {

        int[] teamC = new int[10];

        for (int[] team : teams) {
            teamC = merge(teamC, team);
        }

        return teamC;
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {

        int[] teamC = new int[10];
        int ia = 0, ib = 0, ic = 0;

        while (ic < 10) {

            if (teamA[ia] >= teamB[ib]) {
                teamC[ic] = teamA[ia];
                ia++;
            } else {
                teamC[ic] = teamB[ib];
                ib++;
            }

            ic++;
        }

        return teamC;
    }
}


