import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String s = br.readLine();

        char[] str = s.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            int answer = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j] == alphabet[i]) {
                    answer = j;
                    break;
                } else {
                    answer = -1;
                }
            }
            bw.write(String.valueOf(answer + " "));
        }


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

