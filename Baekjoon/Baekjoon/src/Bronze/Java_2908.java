package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2908 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String x = new StringBuilder(st.nextToken()).reverse().toString();
		String y = new StringBuilder(st.nextToken()).reverse().toString();
		
		bw.write((x.compareTo(y) > 0? x : y));
		
		bw.flush();
        bw.close();
        br.close();
		
		
	}	

}
