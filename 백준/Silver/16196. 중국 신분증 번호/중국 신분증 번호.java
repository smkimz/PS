import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static char[] number;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] days = { { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		number = br.readLine().toCharArray();
		int N = Integer.parseInt(br.readLine()), value = toInteger(0, 5);
		boolean isAvailable = false;
		while (--N >= 0) {
			if (Integer.parseInt(br.readLine()) != value)
				continue;
			isAvailable = true;
		}
		if (!isAvailable) {
			System.out.println("I");
			return;
		}
		value = toInteger(6, 9);
		if (value < 1900 || value > 2011) {
			System.out.println("I");
			return;
		}
		int leapyear = isLeapyear(value);
		value = toInteger(10, 11);
		if (value < 1 || value > 12) {
			System.out.println("I");
			return;
		}
		int month = value;
		value = toInteger(12, 13);
		if (value < 1 || value > days[leapyear][month]) {
			System.out.println("I");
			return;
		}
		value = toInteger(14, 16);
		if (value == 0) {
			System.out.println("I");
			return;
		}
		int gender = value % 2, orderCode = 0;
		for (int i = 0; i <= 16; i++)
			orderCode += (number[i] - '0') * Math.pow(2, 17 - i);
		if (number[17] == 'X')
			orderCode += 10;
		else
			orderCode += number[17] - '0';
		if (orderCode % 11 != 1) {
			System.out.println("I");
			return;
		}
		if (gender == 0)
			System.out.println("F");
		else
			System.out.println("M");
	}

	static int toInteger(int start, int end) {
		int value = 0;
		for (int i = start; i <= end; i++)
			value = value * 10 + number[i] - '0';
		return value;
	}

	static int isLeapyear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return 1;
		return 0;
	}
}