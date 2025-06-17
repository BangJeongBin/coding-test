package leetcode;

import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String s = "(){}}{";

        //--------------------------------------------------------------------------------------------------------------

        char[] strs = s.toCharArray();
        int strsLength = strs.length - 1;

        List<Character> temp = new ArrayList<>();
        boolean result = false;

        // 첫 문자가 닫힌 괄호 인 경우
        if (strs[0] == ')' || strs[0] == '}' || strs[0] == ']') {
            //return false;
        // 마자막 문자가 열린 괄호 인 경우
        } else if (strs[strsLength] == '{' || strs[strsLength] == '[' || strs[strsLength] == '(') {
            //return false;
        }

        for (int i = 0; i < strs.length; i++) {
            bw.write("strs[i] : " + strs[i] + "\n");
            // strs[i]가 열린 괄호인 경우
            if (strs[i] == '(' || strs[i] == '{' || strs[i] == '[') {
                switch (strs[i]) {
                    case '(':
                        temp.add(')');
                        break;
                    case '{':
                        temp.add('}');
                        break;
                    case '[':
                        temp.add(']');
                        break;
                }
            // strs[i]가 닫힌 괄호인 경우
            } else {
                int tempSize = temp.size() - 1; // stack의 pop을 하여 비교함
                if (tempSize >= 0) {
                    if (strs[i] == temp.get(tempSize)) {
                        bw.write("true" + "\n");
                        temp.remove(tempSize); // 사용 된 후 제거
                        result = true;
                    } else {
                        bw.write("false" + "\n");
                        //return false;
                    }
                } else {
                    bw.write("false" + "\n");
                    //return false;
                }
            }
        }
        // 모든 닫힌 블록이 사용되지 않은 경우 false 반환
        if (!temp.isEmpty()) {
            //return false;
        }
        //return result;

        //--------------------------------------------------------------------------------------------------------------


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

