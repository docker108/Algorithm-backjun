package back_5stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stage5_03 {
	
	public static void main(String[] args) throws  IOException {
		
//		150 266 427 = 17037300
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()); 
		String str = String.valueOf(result);

		
		int [] array = new int[10];
		
		
		for (int i = 0; i < str.length(); i++) {
			// java는 UTF-8을 사용하지만 처음 128자는 ASCII를 기반으로해서 -48을 해줘야한다.
			array[(str.charAt(i)-48)]++;
		}
		for (int i : array) {
			System.out.println(i);
		}
		
		br.close();
		
		
	} 
	
}

