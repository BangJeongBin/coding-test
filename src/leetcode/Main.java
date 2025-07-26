package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0111.Minimum%20Depth%20of%20Binary%20Tree/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         *     int val;
         *     TreeNode left;
         *     TreeNode right;
         *     TreeNode() {}
         *     TreeNode(int val) { this.val = val; }
         *     TreeNode(int val, TreeNode left, TreeNode right) {
         *         this.val = val;
         *         this.left = left;
         *         this.right = right;
         *     }
         * }
         */

        // Testcase
        //TreeNode root = {3,9,20,null,null,15,7};

        //--------------------------------------------------------------------------------------------------------------

//        if (root == null) {
//            return 0;
//        }
//        if (root.left == null) {
//            return 1 + minDepth(root.right);
//        }
//        if (root.right == null) {
//            return 1 + minDepth(root.left);
//        }
//        return 1 + Math.min(minDepth(root.left), minDepth(root.right));

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

