package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_3003 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8; 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		king = king - Integer.parseInt(st.nextToken());
		queen = queen - Integer.parseInt(st.nextToken());
		rook = rook - Integer.parseInt(st.nextToken());
		bishop = bishop - Integer.parseInt(st.nextToken());
		knight = knight - Integer.parseInt(st.nextToken());
		pawn = pawn - Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(king) + " ");
		bw.write(String.valueOf(queen) + " ");
		bw.write(String.valueOf(rook) + " ");
		bw.write(String.valueOf(bishop) + " ");
		bw.write(String.valueOf(knight) + " ");
		bw.write(String.valueOf(pawn) + " ");
		
		bw.flush();
		bw.close();
		br.close();
}
}
