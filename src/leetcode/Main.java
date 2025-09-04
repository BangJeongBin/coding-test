package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0200-0299/0205.Isomorphic%20Strings/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "egg";
        String t = "add";

        //--------------------------------------------------------------------------------------------------------------

        Map<Character, Character> d1 = new HashMap<>();
        Map<Character, Character> d2 = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char a = s.charAt(i), b = t.charAt(i);
            if (d1.containsKey(a) && d1.get(a) != b) {
                //return false;
            }
            if (d2.containsKey(b) && d2.get(b) != a) {
                //return false;
            }
            d1.put(a, b);
            d2.put(b, a);
        }
        //return true;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

