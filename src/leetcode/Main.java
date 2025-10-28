package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0003.Longest%20Substring%20Without%20Repeating%20Characters/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "dvdf";

        //--------------------------------------------------------------------------------------------------------------

        int[] alpha = new int[128];
        int result = 0;
        int length = s.length();

        for (int i = 0, j = 0; j < length; j++) {
            char c = s.charAt(j);
            ++alpha[c];
            while (alpha[c] > 1) {
                --alpha[s.charAt(i++)];
            }
            result = Math.max(result, j - i + 1);
        }
        //return result;
        System.out.println("result ==> " + result);

        //--------------------------------------------------------------------------------------------------------------

        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        int maxlen = 0;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            while (hs.contains(ch)) {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(ch);
            maxlen = Math.max(maxlen, r - l + 1);
        }
        //return maxlen;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

