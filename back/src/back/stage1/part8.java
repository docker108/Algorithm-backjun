package back.stage1;

import java.util.Scanner;

public class part8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(0<a && b<10) {
			System.out.println(a/b);
		} else {
			sc.close();
			return;
		}
		sc.close();
		
	}
}