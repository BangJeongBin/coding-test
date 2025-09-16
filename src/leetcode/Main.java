package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2100-2199/2197.Replace%20Non-Coprime%20Numbers%20in%20Array/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {6, 4, 3, 2, 7, 6, 2};

        //--------------------------------------------------------------------------------------------------------------

//        public List<Integer> replaceNonCoprimes(int[] nums) {
//            List<Integer> stk = new ArrayList<>();
//            for (int x : nums) {
//                stk.add(x);
//                while (stk.size() > 1) {
//                    x = stk.get(stk.size() - 1);
//                    int y = stk.get(stk.size() - 2);
//                    int g = gcd(x, y);
//                    if (g == 1) {
//                        break;
//                    }
//                    stk.remove(stk.size() - 1);
//                    stk.set(stk.size() - 1, (int) ((long) x * y / g));
//                }
//            }
//            return stk;
//        }
//
//        private int gcd(int a, int b) {
//            if (b == 0) {
//                return a;
//            }
//            return gcd(b, a % b);
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

