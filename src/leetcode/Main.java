package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3300-3399/3307.Find%20the%20K-th%20Character%20in%20String%20Game%20II/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int k = 5;
        int[] operations = {0, 0, 0};

        //--------------------------------------------------------------------------------------------------------------

        long n = 1;
        int i = 0;
        while (n < k) {
            n *= 2;
            ++i;
        }
        int d = 0;
        while (n > 1) {
            if (k > n / 2) {
                k -= n / 2;
                d += operations[i - 1];
            }
            n /= 2;
            --i;
        }
        //return (char) ('a' + (d % 26));

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

