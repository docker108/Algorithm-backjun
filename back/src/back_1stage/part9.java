package back_1stage;

import java.util.Scanner;

public class part9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(1<a && b<10000) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		} else {
			sc.close();
			return;
		}
		sc.close();
		
	}
}