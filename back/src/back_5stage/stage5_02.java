package back_5stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stage5_02 {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[] = new int[9];
		int cnt = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int MAX = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(MAX < array[i]) {
				MAX = array[i];
				cnt = i+1;
			}
		}
		System.out.println(MAX);
		System.out.println(cnt);
		
		
	}

}
