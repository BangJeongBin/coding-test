package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {9,6,4,2,3,5,7,0,1};

        //--------------------------------------------------------------------------------------------------------------

        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != i) {
                //return i;
                System.out.println("result ==> " + i);
            }
        }
        //return list.size();
        System.out.println("result ==> " + list.size());

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

