package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/1600-1699/1625.Lexicographically%20Smallest%20String%20After%20Applying%20Operations/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "5525";
        int a = 9;
        int b = 2;

        //--------------------------------------------------------------------------------------------------------------

        Deque<String> q = new ArrayDeque<>();
        q.offer(s);
        Set<String> vis = new HashSet<>();
        vis.add(s);
        String ans = s;
        int n = s.length();
        while (!q.isEmpty()) {
            s = q.poll();
            if (ans.compareTo(s) > 0) {
                ans = s;
            }
            char[] cs = s.toCharArray();
            for (int i = 1; i < n; i += 2) {
                cs[i] = (char) (((cs[i] - '0' + a) % 10) + '0');
            }
            String t1 = String.valueOf(cs);
            String t2 = s.substring(n - b) + s.substring(0, n - b);
            for (String t : List.of(t1, t2)) {
                if (vis.add(t)) {
                    q.offer(t);
                }
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

