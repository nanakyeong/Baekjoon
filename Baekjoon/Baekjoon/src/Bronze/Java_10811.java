package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10811 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		
		for(int x = 0; x < n; x++) {
			num[x] = x + 1;
		}
		
		for(int x = 0; x < m; x++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			while(i < j) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				i++;
				j--;
			}
			
		}
			for(int x = 0; x < n; x++) {
				bw.write(num[x] + " ");
		}
			
		bw.flush();
		bw.close();
		br.close();
		
	}
}
