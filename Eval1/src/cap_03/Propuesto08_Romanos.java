package cap_03;

import java.util.Scanner;

public class Propuesto08_Romanos {

	public static String decimalToRoman(int num) {
		String romano = "";
		do {
			while (num >= 1000) {
				romano += "M";
				num -= 1000;
			}
			while (num >= 900) {
				romano += "CM";
				num -= 900;
			}
			while (num >= 500) {
				romano += "D";
				num -= 500;
			}
			while (num >= 400) {
				romano += "CD";
				num -= 400;
			}
			while (num >= 100) {
				romano += "C";
				num -= 100;
			}
			while (num >= 90) {
				romano += "XC";
				num -= 90;
			}
			while (num >= 50) {
				romano += "L";
				num -= 50;
			}
			while (num >= 40) {
				romano += "XL";
				num -= 40;
			}
			while (num >= 10) {
				romano += "X";
				num -= 10;
			}
			while (num >= 9) {
				romano += "IX";
				num -= 9;
			}
			while (num >= 5) {
				romano += "V";
				num -= 5;
			}
			while (num >= 4) {
				romano += "IV";
				num -= 4;
			}
			while (num >= 1) {
				romano += "I";
				num--;
			}
		} while (num != 0);

		return romano;
	}

	public static String decimalToHDecimal(int decimal) {
		String hdec = Integer.toHexString(decimal).toUpperCase();
		return hdec;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Numero: ");
		num = sc.nextInt();

		System.out.println("En romano es " + decimalToRoman(num));
		System.out.println("En hexadecimal es " + decimalToHDecimal(num));

		sc.close();
	}

}