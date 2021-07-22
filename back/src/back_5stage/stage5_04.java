package back_5stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class stage5_04 {
	
	public static void main(String[] args) throws  IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> remainder_List = new ArrayList<>();

		int NUM = 42;
		
		
		for (int i = 0; i < 10; i++) {
			int remainder = Integer.parseInt(br.readLine()) % NUM;
			
			if(!remainder_List.contains(remainder)) {
				remainder_List.add(remainder);
			}
		}
		System.out.println(remainder_List.size());
		
		br.close();
		
		
	} 
	
}

