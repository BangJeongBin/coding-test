package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String s = "a";
        String t = "ab";

        //--------------------------------------------------------------------------------------------------------------

        if (s.length() != t.length()) {
            //return false;
        }

        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
             listS.add(s.charAt(i));
             listT.add(t.charAt(i));
        }

        Collections.sort(listS);
        Collections.sort(listT);

        if (listS.equals(listT)) {
            //return true;
            System.out.println("true");
        } else {
            //return false;
            System.out.println("false");
        }

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

