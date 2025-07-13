package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/?envType=daily-question&envId=2025-07-13
public class Main {

    private int[][] events;
    private int[][] f;
    private int n;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,9};

        //--------------------------------------------------------------------------------------------------------------

        Arrays.sort(players);
        Arrays.sort(trainers);
        int m = players.length, n = trainers.length;
        for (int i = 0, j = 0; i < m; ++i, ++j) {
            while (j < n && trainers[j] < players[i]) {
                ++j;
            }
            if (j == n) {
                //return i;
            }
        }
        //return m;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

