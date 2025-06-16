package leetcode;

import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        String[] strs = {"flower", "flow", "flight"};

        //--------------------------------------------------------------------------------------------------------------

        // 해당하는 단어를
        String result = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(result) != 0){ // 일치하는 index에 일치하는 문자가 있는 경우
                result = result.substring(0, result.length() - 1);
                //bw.write(result + "\n");
            }
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

