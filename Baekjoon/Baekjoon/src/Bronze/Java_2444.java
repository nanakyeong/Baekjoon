package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_2444 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int s = Integer.parseInt(br.readLine());
		
        for(int i = 0; i < s; i++) {
            for(int j = 0; j < s - i - 1; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for(int i = s - 2; i >= 0; i--) {
            for(int j = 0; j < s - i - 1; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
		
	bw.flush();
	bw.close();
	br.close();
	}

}
