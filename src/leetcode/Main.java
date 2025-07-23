package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums1 = {-1,0,0,3,3,3,0,0,0}; // nums1의 길이는 (m + n)
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;

        //--------------------------------------------------------------------------------------------------------------

        List list = new ArrayList();

        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }

        for (Object i : list) {
            System.out.println("before sort : " + i);
        }
        Collections.sort(list);

        for (Object i : list) {
            System.out.println("after sort : " + i);
        }

        for (int i = 0; i < list.size(); i++) {
            nums1[i] = (int)list.get(i);
        }

        for (int i : nums1) {
            System.out.println(i);
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

