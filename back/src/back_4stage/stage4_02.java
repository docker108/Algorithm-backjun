package back_4stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stage4_02 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String check;
		
		while( (check=br.readLine()) != null ) {
			
			st = new StringTokenizer(check, " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			sb.append(x+y).append("\n");
			
		}
		System.out.print(sb);
		
		
		
	}

}
