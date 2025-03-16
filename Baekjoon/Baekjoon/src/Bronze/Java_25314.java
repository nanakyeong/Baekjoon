package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//StringBuilder을 사용하면 더 효율적이라는 걸 알게 됨.
public class Java_25314 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n/4; i++) {
			sb.append("long ");
		}
		
		sb.append("int");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}

}
