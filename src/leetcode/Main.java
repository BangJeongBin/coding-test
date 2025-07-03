package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3300-3399/3304.Find%20the%20K-th%20Character%20in%20String%20Game%20I/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int k = 5;

        //--------------------------------------------------------------------------------------------------------------

        List<Integer> word = new ArrayList<>();
        word.add(0);
        while (word.size() < k) {
            for (int i = 0, m = word.size(); i < m; ++i) {
                word.add((word.get(i) + 1) % 26);
            }
        }
        System.out.println((char) ('a' + word.get(k - 1)));
        //return (char) ('a' + word.get(k - 1));

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

