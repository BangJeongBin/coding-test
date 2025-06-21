package leetcode;

import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String haystack = "hello";
        String needle = "ll";

        //--------------------------------------------------------------------------------------------------------------

        if (haystack.contains(needle)) {
            bw.write(String.valueOf(haystack.indexOf("sad")));
            //return haystack.indexOf(needle);
        } else {
            bw.write("false");
            //return -1;
        }

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

