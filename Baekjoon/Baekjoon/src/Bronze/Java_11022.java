package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_11022 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int x = 1;
		
		for(int i = 0; i < t; i++) {
			
			String[] c = br.readLine().split(" ");
			int a = Integer.parseInt(c[0]);
			int b = Integer.parseInt(c[1]);
			int sum = a + b;
			
		
			bw.write("Case #" + x + ": " + a + " + " + b + " = " + sum + "\n");
			x++;
	}
		bw.flush();
		bw.close();
	}

}
