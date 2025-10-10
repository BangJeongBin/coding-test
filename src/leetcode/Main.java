package leetcode;

import java.io.*;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String ransomNote = "aa";
        String magazine = "aab";

        //--------------------------------------------------------------------------------------------------------------

        int[] cnt = new int[26];
        for (int i = 0; i < magazine.length(); ++i) { // 알파벳마다 개수를 counting
            ++cnt[magazine.charAt(i) - 'a'];
        }
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (--cnt[ransomNote.charAt(i) - 'a'] < 0) {
                //return false;
                System.out.println("false");
            }
        }
        //return true;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

