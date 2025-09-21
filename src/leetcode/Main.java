package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 :
public class Main {

    public static void solution() throws IOException {

        // Testcase
        String pattern = "abba";
        String s = "dog cat cat fish";

        //--------------------------------------------------------------------------------------------------------------

        Map<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");

        if (pattern.length() != str.length) {
            //return false;
            System.out.println("false");
        }

        for (int i = 0; i < pattern.length(); i++) {
             if (!map.containsValue(str[i]) && !map.containsKey(pattern.charAt(i))) { // pattren이 등록되지 않은 경우
                 map.put(pattern.charAt(i), str[i]);
                 System.out.println("map put ==> " + pattern.charAt(i) + ", " + str[i]);
             } else {                                   // pattren이 등록되어 있는 경우
                 if (!map.containsKey(pattern.charAt(i))) { // s가 틀려서 pattern이 등록이 되지 않은 경우
                     //return false;
                     System.out.println("false");
                 } else if (!map.get(pattern.charAt(i)).equals(str[i])) { // 등록된 pattern에 맞지 않는 경우
                     //return false;
                     System.out.println("false");
                 }
             }
        }
        //return true;
        System.out.println("true");

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

