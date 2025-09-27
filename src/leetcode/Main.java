package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        //--------------------------------------------------------------------------------------------------------------

        List<Character> list = new ArrayList<>();
        for (char c : s) {
            list.add(c);
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

