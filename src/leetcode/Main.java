package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int numRows = 5;

        //--------------------------------------------------------------------------------------------------------------

        int[][] triangle = new int[numRows][numRows]; // 실제 연산용 변수
        List<List<Integer>> result = new ArrayList<>(); // 리턴용 변수

        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1; // 초기값 지정
            triangle[i][i] = 1; // ,,
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int i = 0; i < numRows; i++) { // 2차원 배열을 2차원 리스트로 복사
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < triangle.length; j++) {

                if (triangle[i][j] != 0) {
                    row.add(triangle[i][j]);
                } else {
                    break;
                }
            }
            result.add(row);
        }

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

