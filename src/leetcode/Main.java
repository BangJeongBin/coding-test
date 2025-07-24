package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0094.Binary%20Tree%20Inorder%20Traversal/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        List<Integer> root =new ArrayList<>();
        root.addAll(Arrays.asList(1,null,2,3));

        //private List<Integer> ans = new ArrayList<>();

        //--------------------------------------------------------------------------------------------------------------

//        public List<Integer> inorderTraversal(TreeNode root) {
//            dfs(root);
//            return ans;
//        }
//
//        private void dfs(TreeNode root) {
//            if (root == null) {
//                return;
//            }
//            dfs(root.left);
//            ans.add(root.val);
//            dfs(root.right);
//        }

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

