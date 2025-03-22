package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 구름톤 준비로 이것저것 할 게 많아 알고리즘 문풀에 많은 시간을 쏟지 못하고 있다..
// 하루에 한문제라도 제대로 푸는 걸 목표로 해야겠담!
// 포기하지 말고 잔디 가보자공~~
public class Java_10809 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String s = br.readLine().toLowerCase();
		
		int[] x = new int[26];
		
		for(int i = 0; i < 26; i++) {
			x[i] = -1;
		}
		
		for(int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			int y = ch - 'a';
			
			if(x[y] == -1) {
				x[y] = i;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			bw.write(x[i] + " ") ;
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	
	}
}
