import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String multiply = (String.valueOf(n)); // 인덱스 추출을 위해 casting

        int[] count = new int[10];

        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;

        char[] arr = multiply.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if ((arr[i] - '0') == j) { // char형을 int로 바꾸기 위해 "- '0'" 사용
                    count[j]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            bw.write(count[i] + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

