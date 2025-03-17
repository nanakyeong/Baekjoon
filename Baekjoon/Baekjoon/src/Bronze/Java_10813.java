package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//운동 다녀와서 잠이 너무 몰려와.. 오늘은 여기까지다.. 낼 세문제 더 풀겠다이..
public class Java_10813 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int x = 0; x < n; x++) {
			arr[x] = x + 1;
		}
		
		for(int x = 0; x < m; x++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int temp = arr[i -1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		
		for(int x = 0; x < n; x++) {
			bw.write(arr[x] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
