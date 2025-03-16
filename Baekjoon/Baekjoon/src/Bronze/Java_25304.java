package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_25304 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(bf.readLine());
		int n = Integer.parseInt(bf.readLine());
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			String[] c = bf.readLine().split(" ");
			int a = Integer.parseInt(c[0]);
			int b = Integer.parseInt(c[1]);
			sum += a * b;
			
		}
		
		if(sum == x) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.flush();
		bw.close();
		
	}

}
