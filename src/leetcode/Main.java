package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};

        //--------------------------------------------------------------------------------------------------------------

        List<Integer> list = new ArrayList<>();

        for (int i : nums) { // List로 변경 후 오름차순 정렬
            list.add(i);
        }
        Collections.sort(list);

        for (int i = 1; i < list.size(); i += 2) {
            if (!list.get(i - 1).equals(list.get(i))) {
                //return list.get(i - 1);
                System.out.println("i = " + (i - 1));
            }
        }

        //return list.get(list.size() - 1);
        System.out.println(list.get(list.size() - 1)); // length가 1개 인 경우

        //--------------------------------------------------------------------------------------------------------------

    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

