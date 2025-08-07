package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0168.Excel%20Sheet%20Column%20Title/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int columnNumber = 702;

        //--------------------------------------------------------------------------------------------------------------
        // 1의 자리가 "Z"인 경우 오류 발생. 해결 못함
        // --columnNumber 을 사용해야 함.

        String result = ""; // 리턴 변수

        if (columnNumber < 27) { // 답이 한 자리인 경우
            char ch = (char) (columnNumber + 64);
            //return String.valueOf(ch);
        } else { // 답이 한 자리 이상 일경우
            while (columnNumber > 26) {
                result = (char) (((columnNumber % 26) + 64) == 64 ? 90 : ((columnNumber % 26) + 64)) + result;
                columnNumber /= 27;
            }
            result = (char) (columnNumber + 64) + result;
            //return result;
            System.out.println("result = " + result);
        }

        //--------------------------------------------------------------------------------------------------------------

        StringBuilder res = new StringBuilder();
        while (columnNumber != 0) {
            --columnNumber;
            res.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        //return res.reverse().toString();

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

