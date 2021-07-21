package back_5stage;

import java.util.Scanner;

public class stage5_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int NUM = sc.nextInt();
		
		int array[] = new int[NUM];
		
		int MIN = 0;
		int MAX = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		MIN = MAX = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(MAX < array[i]) {
				MAX = array[i];
			}
			if(MIN > array[i]) {
				MIN = array[i];
			}
		}
		System.out.println(MIN+" "+MAX);
		sc.close();
	}

}
