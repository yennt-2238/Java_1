package DateClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input year value: ");
		int year = sc.nextInt();

		System.out.println("Input month value: ");
		int month = sc.nextInt();

		System.out.println("Input day value");
		int day = sc.nextInt();
	  Check_Valid_Date a = new Check_Valid_Date(year, month, day);
	  a.checkNamNhuan(year, month, day);

	}

}
