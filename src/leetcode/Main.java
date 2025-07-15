package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3100-3199/3136.Valid%20Word/Solution.java
public class Main {

    private int[][] events;
    private int[][] f;
    private int n;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String word = "234Adas";

        //--------------------------------------------------------------------------------------------------------------

        if (word.length() < 3) {
            //return false;
        }
        boolean hasVowel = false, hasConsonant = false;
        boolean[] vs = new boolean[26];
        for (char c : "aeiou".toCharArray()) {
            vs[c - 'a'] = true;
        }
        for (char c : word.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (vs[Character.toLowerCase(c) - 'a']) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(c)) {
                //return false;
            }
        }
        //return hasVowel && hasConsonant;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

