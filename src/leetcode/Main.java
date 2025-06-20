package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://jini-space.tistory.com/72
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        //--------------------------------------------------------------------------------------------------------------

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                i--; // list.remove()는 삭제되면 index가 하나 밀려나 건너 뛰어지게 된다. 이 방법 아니면 뒤에서 부터 시작하는 방법도 있다.
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        //return list.size();
        bw.write(String.valueOf(list.size()) + "\n");
        for (int num : list) {
            bw.write("num : " + num + "\n");
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

