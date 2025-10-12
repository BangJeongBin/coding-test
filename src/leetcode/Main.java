package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0387.First%20Unique%20Character%20in%20a%20String/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "leetcode";

        //--------------------------------------------------------------------------------------------------------------

        int[] cnt = new int[26];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            ++cnt[s.charAt(i) - 'a'];  // cnt[s.charAt(i) - 'a'] += 1; 과 같음.
        }
        for (int i = 0; i < n; ++i) {
            if (cnt[s.charAt(i) - 'a'] == 1) {
                //return i;
                System.out.println("i ==> " + i);
                break;
            }
        }
        //return -1;
        System.out.println(-1);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

