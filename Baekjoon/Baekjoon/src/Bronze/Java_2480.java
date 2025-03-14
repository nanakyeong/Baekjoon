 package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2480 {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(a == b && a == c) {
            bw.write(10000 + a * 1000 + "\n");
        } 
        else if(a == b || a == c) {
            bw.write(1000 + a * 100 + "\n");
        } else if(b == c) {
            bw.write(1000 + b * 100 + "\n");
        }
        else {
            int max = Math.max(a, Math.max(b, c));
            bw.write(max * 100 + "\n");
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}
