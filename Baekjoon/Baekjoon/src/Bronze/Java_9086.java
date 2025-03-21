package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_9086 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < t; i++) {
			String s = bf.readLine().trim();
			bw.write(s.charAt(0)+ "" + s.charAt(s.length()-1) + "\n");
		}
		
		bw.flush();
		bw.close();
		bf.close();
		
		
		
	}
}
