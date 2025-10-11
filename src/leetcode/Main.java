package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3100-3199/3186.Maximum%20Total%20Damage%20With%20Spell%20Casting/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] power = {1, 1, 3, 4};

        //--------------------------------------------------------------------------------------------------------------

//        private Long[] f;
//        private int[] power;
//        private Map<Integer, Integer> cnt;
//        private int[] nxt;
//        private int n;
//
//        public long maximumTotalDamage(int[] power) {
//            Arrays.sort(power);
//            this.power = power;
//            n = power.length;
//            f = new Long[n];
//            cnt = new HashMap<>(n);
//            nxt = new int[n];
//            for (int i = 0; i < n; ++i) {
//                cnt.merge(power[i], 1, Integer::sum);
//                int l = Arrays.binarySearch(power, power[i] + 3);
//                l = l < 0 ? -l - 1 : l;
//                nxt[i] = l;
//            }
//            return dfs(0);
//        }
//
//        private long dfs(int i) {
//            if (i >= n) {
//                return 0;
//            }
//            if (f[i] != null) {
//                return f[i];
//            }
//            long a = dfs(i + cnt.get(power[i]));
//            long b = 1L * power[i] * cnt.get(power[i]) + dfs(nxt[i]);
//            return f[i] = Math.max(a, b);
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

