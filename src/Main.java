import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alphabet = br.readLine();
        String answer = "";

        for (int i = 0; i < alphabet.length(); i++) {
            char spell = alphabet.charAt(i);

            if (Character.isUpperCase(spell)) {
                answer += Character.toLowerCase(spell);
            } else {
                answer += Character.toUpperCase(spell);
            }
        }

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

