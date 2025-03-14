package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_9498 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(bf.readLine());

		if(a > 89) {
			bw.write("A");
		}
		
		else if(a > 79) {
			bw.write("B");
		}
		
		else if(a > 69) {
			bw.write("C");
		}
		
		else if(a > 59) {
			bw.write("D");
		}
		
		else {
			bw.write("F");
		}
		
		bw.flush();
		bf.close();
		bw.close();
	}

}
