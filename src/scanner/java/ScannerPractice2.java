package scanner.java;

import java.util.Scanner;

public class ScannerPractice2
{

	public static void main (String[] args)
	{
		Scanner fetch = new Scanner(System.in);
		
		System.out.println("Enter your birth month");
				
		int birthMonth= fetch.nextInt();
		if (birthMonth >= 8 && birthMonth <= 12) {
			System.out.println("Your birthstone is Opal");
		}else if (birthMonth <8 && birthMonth >0) {
			System.out.println("Your birthstone is Tiger eye");
		}else {
			System.out.println("");
		}
		
	}

}
