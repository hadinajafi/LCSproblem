package lcsjava;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter seq1: ");
		String s1 = s.next();
		System.out.println("Enter seq2: ");
		String s2 = s.next();
		LCSclass lcs = new LCSclass(s1, s2);
	}

}
