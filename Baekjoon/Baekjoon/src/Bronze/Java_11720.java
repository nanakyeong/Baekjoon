package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_11720 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += s.charAt(i) - '0'; //123은 문자열임
		}
		
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
