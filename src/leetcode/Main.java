package leetcode;

import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String s = "MCMXCIV";

        //--------------------------------------------------------------------------------------------------------------

        int result = 0;
        char[] str = s.toCharArray();

        for (char c : str) {
            switch (c) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        //bw.write("for문 나온 후 : " + result + "\n");

        if (s.contains("IV")) {
            result -= 6;
            result += 4;
        }
        if (s.contains("IX")) {
            result -= 11;
            result += 9;
        }
        if (s.contains("XL")) {
            result -= 60;
            result += 40;
        }
        if (s.contains("XC")) {
            result -= 110;
            result += 90;
        }
        if (s.contains("CD")) {
            result -= 600;
            result += 400;
        }
        if (s.contains("CM")) {
            result -= 1100;
            result += 900;
        }
        //bw.write("if문 나온 후 : " + result);
        //return result;

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

