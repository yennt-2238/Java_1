package DateClass;

import java.util.Scanner;

public class Check_Valid_Date {
	private int year;
	private int month;
	private int day;

	public Check_Valid_Date(int year, int month, int day) {
		if (year <= 0 || month <= 0 || day <= 0 && day > 31) {
			System.out.println("Invalid data");
			return;
		}
		System.out.println("Valid data:");
	}

	public void checkNamNhuan(int year, int month, int day) {
		if (month == 2 && year % 4 == 0 || year % 400 == 0) {
			if (day == 29) {
				System.out.println(" Đây là năm nhuận");
				return;
			}
			if (day > 29) {
				System.out.println("Invalid data");
				return;
			}
			System.out.println("Đây không phải là năm nhuận");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.println("Invalid data");
				return;
			}
			System.out.println("Valid data: " + year + "-" + month + "-" + day);
			return;
		}
		if (day > 30) {
			System.out.println("invalid data");
			return;
		}
		System.out.println("Valid data: " + year + "-" + month + "-" + day);
		return;
	}

}
