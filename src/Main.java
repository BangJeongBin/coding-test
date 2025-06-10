import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[10];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n.length; i++) { // 10개의 정수의 값을 받는 배열
            n[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n.length; i++) {
            int a = n[i] % 42;

            if (!map.containsValue(a)) { // 중복 value 존재 여부 반환
                map.put(i, a);
            }
        }

        bw.write(String.valueOf(map.size()));

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

