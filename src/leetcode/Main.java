package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0101.Symmetric%20Tree/Solution.java
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
        //TreeNode root = {1,2,2,3,4,4,3};

        //--------------------------------------------------------------------------------------------------------------

        //return dfs(root.left, root.right);

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }

//    private boolean dfs(TreeNode root1, TreeNode root2) {
//        if (root1 == root2) {
//            return true;
//        }
//        if (root1 == null || root2 == null || root1.val != root2.val) {
//            return false;
//        }
//        return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
//    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

