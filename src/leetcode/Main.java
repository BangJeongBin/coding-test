package leetcode;

import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        //--------------------------------------------------------------------------------------------------------------
        // Solution 1

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        System.out.println(sb.reverse().toString());
        //return sb.reverse().toString();

        //--------------------------------------------------------------------------------------------------------------
        // Solution 2
        // Long을 초과하는 자릿수는 해결 안됨

//        if (a.equals("0") && b.equals("0")) {
//            //return "0";
//        }
//
//        char[] ac = a.toCharArray();
//        char[] bc = b.toCharArray();
//
//        int sum1 = 1, sum2 = 1;
//        Long ai = 0L, bi = 0L;
//
//        // testcase a, b 를 10진수로 바꾸는 코드
//        for (int i = ac.length - 1; i >= 0; i--) {
//            ai += (ac[i] - '0') * sum1;
//            sum1 *= 2;
//        }
//        for (int i = bc.length - 1; i >= 0; i--) {
//            bi += (bc[i] - '0') * sum2;
//            sum2 *= 2;
//        }
//
//        Long result = ai + bi;
//        String binary = "";
//
//        // a + b 의 값을 다시 2 진수로 바꾸는 코드
//        while (result > 0) {
//            bw.write("result : " + result);
//            binary = (result % 2) + binary;
//            result = result / 2;
//            bw.write(", binary : " + binary + "\n");
//        }
//        //return binary;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

