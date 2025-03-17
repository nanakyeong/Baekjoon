package Bronze;

import java.io.*;

public class Java_10807 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] input = br.readLine().trim().split("\\s+");
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = Integer.parseInt(input[i]);
			
		}
		
		int v = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < arr.length; j++) {
			if(v == arr[j]) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count) + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
