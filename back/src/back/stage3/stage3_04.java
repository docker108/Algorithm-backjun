package back.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class stage3_04 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(input.readLine());
		
		StringTokenizer st;
		
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(input.readLine()," ");
			output.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		
		input.close();
		
		output.flush();
		output.close();
		
	}

}
