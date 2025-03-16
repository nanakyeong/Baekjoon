package Bronze;

import java.io.*;

//EOF는 알고리즘 문제를 풀 때 주로 입력값을 얼마나 받을지 명시하지 않을 경우 사용
//EOF 사용 시에는 String 형식임.
//Scanner로 풀면 금방인데 buffer 형식은 문법도 많고 헷갈리는 게 꽤 있다.. 하지만 처리 속도도 빠르고
//Scanner보다 이점이 많다니 계속 사용할 예정임^^
public class Java_10952 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input;
		
		while((input = br.readLine()) != null) {
			String[] c = input.split(" ");
			int a = Integer.parseInt(c[0]);
			int b = Integer.parseInt(c[1]);
			
			if(a == 0 && b == 0) {
				break;
			}
				
			int sum = a + b;
			bw.write(sum + "\n");
		
		}
		
		bw.flush();
		bw.close();

}
}
