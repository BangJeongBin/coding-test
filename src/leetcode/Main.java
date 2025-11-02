package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2200-2299/2257.Count%20Unguarded%20Cells%20in%20the%20Grid/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase


        //--------------------------------------------------------------------------------------------------------------

//        class Solution {
//            public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
//                int[][] g = new int[m][n];
//                for (var e : guards) {
//                    g[e[0]][e[1]] = 2;
//                }
//                for (var e : walls) {
//                    g[e[0]][e[1]] = 2;
//                }
//                int[] dirs = {-1, 0, 1, 0, -1};
//                for (var e : guards) {
//                    for (int k = 0; k < 4; ++k) {
//                        int x = e[0], y = e[1];
//                        int a = dirs[k], b = dirs[k + 1];
//                        while (x + a >= 0 && x + a < m && y + b >= 0 && y + b < n && g[x + a][y + b] < 2) {
//                            x += a;
//                            y += b;
//                            g[x][y] = 1;
//                        }
//                    }
//                }
//                int ans = 0;
//                for (var row : g) {
//                    for (int v : row) {
//                        if (v == 0) {
//                            ++ans;
//                        }
//                    }
//                }
//                return ans;
//            }
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

