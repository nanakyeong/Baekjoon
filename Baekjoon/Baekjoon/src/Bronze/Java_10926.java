package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 백준에서 계속 런타임 에러 떠서 블로그 써치해도 안 보이길래 chat gpt한테 물어봤더니 
// 개행 없어서 출력 오류가 발생한거래.. 진짜 세상이 억까치는거임..(10분 날림)

public class Java_10926 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		
		if(s.matches("[a-z]+") && s.length() <= 50) {
			bw.write(s + "??!\n");
		}
		
		bw.flush();
		bw.close();
	}

}
