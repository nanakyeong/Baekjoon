import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1010 {

    static int b[][] = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(com(N,M)).append('\n');
        }

        System.out.println(sb);

    }

    static int com(int N, int M) {

        if(b[M][N] > 0){
            return b[M][N];
        }

        if(N == 0 || N == M){
            return b[M][N] = 1;
        }

        return b[M][N] = com(N - 1, M - 1) + com(N, M - 1);
    }
}
