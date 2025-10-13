package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2200-2299/2273.Find%20Resultant%20Array%20After%20Removing%20Anagrams/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};

        //--------------------------------------------------------------------------------------------------------------

//        public List<String> removeAnagrams(String[] words) {
//            List<String> ans = new ArrayList<>();
//            ans.add(words[0]);
//            for (int i = 1; i < words.length; ++i) {
//                if (check(words[i - 1], words[i])) {
//                    ans.add(words[i]);
//                }
//            }
//            return ans;
//        }
//
//        private boolean check(String s, String t) {
//            if (s.length() != t.length()) {
//                return true;
//            }
//            int[] cnt = new int[26];
//            for (int i = 0; i < s.length(); ++i) {
//                ++cnt[s.charAt(i) - 'a'];
//            }
//            for (int i = 0; i < t.length(); ++i) {
//                if (--cnt[t.charAt(i) - 'a'] < 0) {
//                    return true;
//                }
//            }
//            return false;
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

