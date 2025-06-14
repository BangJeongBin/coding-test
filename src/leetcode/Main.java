package leetcode;

import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int x = 121;

        //--------------------------------------------------------------------------------------------------------------

        if (x <= 0) { // 음수인 경우 false return
            //return false;
        } else if (x == 0) { // 0인 경우 ture return
            //return true;
        } else if ((x % 10) == x) { // 1자리 수 인 경우 true return
            //return true;
        }

        // 문자열로 변환 후 대조
        String str = "" + x;
        char[] strs = str.toCharArray();

        int result = 0;
        int len = (int)Math.ceil((double)strs.length / 2); // result 값과 비교하여 true 반환

        for (int i = 0; i < len; i++) {
            for (int j = ((strs.length - 1) - i); j > 0; j--) {
                if (strs[i] == strs[j]) {
                    //bw.write(String.valueOf("strs[i] : " + strs[i] + " strs[j] : " + strs[j] + "\n"));
                    result++;
                    break;
                }  else {
                    //return false;
                }
            }
        }

        if (result == len) { // 앞에 수와 뒤에수가 같은 경우 result++ == 길이의 / 2 가 같은 경우 palindrome 검사 통과
            //return true;
        }
        //return false;

        //--------------------------------------------------------------------------------------------------------------

        bw.write(String.valueOf("result : " + result + ", len : " + len));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

