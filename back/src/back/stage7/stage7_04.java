package back.stage7;

import java.util.ArrayList;
import java.util.Scanner;

public class stage7_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(start);
		
		for (int i = 0; i < start; i++) {
			ArrayList<String> arrayValue = new ArrayList<String>();
			int count = sc.nextInt();
			String value = sc.next();
			
			String[] temp = value.split("");
			
			for (int j = 0; j < temp.length; j++) {
				for (int k = 0; k < count; k++) {
					
					arrayValue.add(temp[j]);
				}
				
			}
			list.add(arrayValue);
		}
		
		for (int i = 0; i < start; i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j));
			}
			System.out.println();
		}
	
		sc.close();
	}

}
