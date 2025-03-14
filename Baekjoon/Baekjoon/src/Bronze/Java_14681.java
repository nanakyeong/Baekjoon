package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_14681 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(bf.readLine());
		int y = Integer.parseInt(bf.readLine());
		
		if(x > 0 && y > 0) {
			bw.write("1");
		}
		
		else if(x < 0 && y > 0){
			bw.write("2");
		}
		
		else if(x < 0 && y < 0) {
			bw.write("3");
		}
		
		else {
			bw.write("4");
		}
		
		bw.flush();
		bf.close();
		bw.close();
	}

}
