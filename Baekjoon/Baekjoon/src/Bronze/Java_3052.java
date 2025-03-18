package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_3052 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean [] num = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int x = Integer.parseInt(br.readLine());
			int div = x % 42;
		
		if(!num[div]) { //이미 나왔던 나머지는 
			num[div] = true;
			count++;
		}
		}
		
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
