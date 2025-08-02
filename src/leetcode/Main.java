package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0125.Valid%20Palindrome/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "A man, a plan, a canal: Panama";

        //--------------------------------------------------------------------------------------------------------------
        // 정규표현식 필터링에서 막힘

//        boolean result = false; // 결과 값 변수
//        String str = ""; // lowerCase 저장 변수
//
//        if (s.length() == 1) {
//            //return true;
//        }
//
//        for (char ch : s.toCharArray()) {
//            if (ch == ' ' || ch == ':' || ch == ',' || ch == '.') {
//                continue;
//            }
//            str += Character.toLowerCase(ch);
//        }
//
//        if (str.length() == 1 || str.length() == 0) {
//            //return true;
//            System.out.println("dsfads");
//        }
//
//        char[] palin = str.toCharArray();
//        int i = 0;
//        int k = (palin.length - 1);
//
//        for (int j = 0; j < (palin.length / 2); j++) {
//                System.out.println("palin[i]" + palin[i] + ", palin[k] = " + palin[k]);
//            if (palin[i++] == palin[k--]) {
//                result = true;
//            } else {
//                result = false;
//            }
//        }
//        System.out.println("result = " + result);
//        //return result;

        //--------------------------------------------------------------------------------------------------------------

        int num = 1;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            System.out.print(num++ + "회 : ");
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
                System.out.println("왼쪽이 문자나 숫자가 아닌경우 스킵");
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
                System.out.println("오른쪽이 문자나 숫자가 아닌경우 스킵");
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                //return false;
                System.out.println("회문이 아닌경우");
                break;
            } else {
                ++i;
                --j;
                System.out.println("회문인 경우");
            }
        }
        //return true;

        //--------------------------------------------------------------------------------------------------------------

    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

