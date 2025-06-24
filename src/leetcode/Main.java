package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0066.Plus%20One/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        //--------------------------------------------------------------------------------------------------------------
        // Solution 1

        int n = digits.length; // testcase 길이

        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            digits[i] %= 10;

            if (digits[i] != 0) { // 마지막 인덱스가 9가 아닌 경우
                //return digits;
            }
        }

        // 마지막 인덱스가 9인 경우
        digits = new int[n + 1];
        digits[0] = 1;
        //return digits;

        //--------------------------------------------------------------------------------------------------------------
        // Solution 2
        // ● Long 보다 큰 수가 나와서 pass 못함

        int digitLen = digits.length; // testcase 길이
        int strLen = 0; // +1 연산 후 길이
        String str = "";

        for (int digit : digits) {
            str += digit;
        }
        // 배열을 풀어서 연산 후 다시 문자열로 캐스팅
        String result = (Long.parseLong(str) + 1) + "";
        strLen = result.length();

        if (digitLen != strLen) {
            // 배열을 복사하여 다시 할당.
            digits = Arrays.copyOf(digits, digitLen + 1);
        }

        for (int i = 0; i < digits.length; i++) {
            digits[i] = result.charAt(i) - '0';
        }

        for (int digit : digits) {
            System.out.println("digit : " + digit);
        }
        //return digits;

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

