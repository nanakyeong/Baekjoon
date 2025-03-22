package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_2675 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int x = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < x; i++) {
			String[] s = br.readLine().split(" ");
			int y = Integer.parseInt(s[0]);
			String z = s[1];
			
			for(int j = 0; j < z.length(); j++) {
				char ch = z.charAt(j);
				for(int k = 0; k < y; k++) {
					bw.write(ch);
				}
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
