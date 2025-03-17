package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10810 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int x = 0; x < m; x++) {
			st = new StringTokenizer(br.readLine()); // 새 줄 입력 받을 때 쓰기(런타임 에러 해결)
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int y = i-1; y < j; y++) {
				arr[y] = k;
			}
		}
		for(int x = 0; x < n; x++) {
			bw.write(arr[x] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();

		
	}
}
