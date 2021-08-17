package back_7stage;

import java.util.Scanner;

public class stage7_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = new StringBuilder(s.next()).reverse().toString();
		String b = new StringBuilder(s.next()).reverse().toString();
		System.out.println((Integer.parseInt(a) > Integer.parseInt(b) ? a : b));
		s.close();
	}

}
