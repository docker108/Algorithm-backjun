package back.stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class stage4_01 {
	
	public static void main(String[] args) throws IOException {
		
		// Reader -> Scanner와 유사
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Writer -> System.out.println();과 유사
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st; // StringTokenizer인자값에 입력 문자열 넣음
		
		while(true) {
			String s = br.readLine();
			st = new StringTokenizer(s, " ");
			
			String array[] = s.split(" ");
			
			if(Integer.parseInt(array[0]) == 0 && Integer.parseInt(array[1]) == 0 ) {
				break;
			}
			
			System.out.println(st);
			
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
