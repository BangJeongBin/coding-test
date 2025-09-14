package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0900-0999/0966.Vowel%20Spellchecker/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};

        //--------------------------------------------------------------------------------------------------------------

//        public String[] spellchecker(String[] wordlist, String[] queries) {
//            Set<String> s = new HashSet<>();
//            Map<String, String> low = new HashMap<>();
//            Map<String, String> pat = new HashMap<>();
//            for (String w : wordlist) {
//                s.add(w);
//                String t = w.toLowerCase();
//                low.putIfAbsent(t, w);
//                pat.putIfAbsent(f(t), w);
//            }
//            int m = queries.length;
//            String[] ans = new String[m];
//            for (int i = 0; i < m; ++i) {
//                String q = queries[i];
//                if (s.contains(q)) {
//                    ans[i] = q;
//                    continue;
//                }
//                q = q.toLowerCase();
//                if (low.containsKey(q)) {
//                    ans[i] = low.get(q);
//                    continue;
//                }
//                q = f(q);
//                if (pat.containsKey(q)) {
//                    ans[i] = pat.get(q);
//                    continue;
//                }
//                ans[i] = "";
//            }
//            return ans;
//        }
//
//        private String f(String w) {
//            char[] cs = w.toCharArray();
//            for (int i = 0; i < cs.length; ++i) {
//                char c = cs[i];
//                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                    cs[i] = '*';
//                }
//            }
//            return String.valueOf(cs);
//        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

