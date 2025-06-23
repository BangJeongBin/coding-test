package leetcode;

import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String s = "   fly me   to   the moon  ";

        //--------------------------------------------------------------------------------------------------------------
        // Solution 1

//        char[] strs = s.toCharArray();
//        List<String> list = new ArrayList<>();
//        String result = "";
//
//        for (int j = 0; j < strs.length; j++) {
//            if (strs[j] != ' ') {
//                result += strs[j];
//                bw.write(result + "\n");
//            } else if (strs[j] == ' ' && !result.equals("")) { // str의 끝이 공백으로 끝나는 경우 list의 공백이 삽입되는 것을 방지
//                list.add(result);
//                result = "";
//            }
//        }
//
//        if (result.equals("")) {
//            bw.write("1 - " + list.get(list.size() - 1).length());
//            //return (list.get(list.size() - 1)).length();
//        } else {
//            bw.write("2 - " + result.length());
//            //return result.length();
//        }

        //--------------------------------------------------------------------------------------------------------------
        // Solution 2

        StringTokenizer st = new StringTokenizer(s, " ");
        List<String> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        bw.write((list.get(list.size() - 1)).length());
        //return (list.get(list.size() - 1)).length();

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

