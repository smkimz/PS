import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> rightCodes = new HashMap<>();
		rightCodes.put("**** ** ** ****", 0);
		rightCodes.put("  *  *  *  *  *", 1);
		rightCodes.put("***  *****  ***", 2);
		rightCodes.put("***  ****  ****", 3);
		rightCodes.put("* ** ****  *  *", 4);
		rightCodes.put("****  ***  ****", 5);
		rightCodes.put("****  **** ****", 6);
		rightCodes.put("***  *  *  *  *", 7);
		rightCodes.put("**** ***** ****", 8);
		rightCodes.put("**** ****  ****", 9);
		rightCodes.put("               ", -1);
		char[] input;
		String[] codes = new String[8];
		int code = 0, number;
		boolean isBlank = false;
		for (int i = 0; i < 8; i++)
			codes[i] = "";
		for (int i = 0; i < 5; i++) {
			input = br.readLine().toCharArray();
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 3; k++) {
					if (j * 4 + k >= input.length)
						codes[j] += " ";
					else
						codes[j] += input[j * 4 + k];
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			if (!rightCodes.containsKey(codes[i])) {
				System.out.println("BOOM!!");
				return;
			}
			number = rightCodes.get(codes[i]);
			if (number == -1) {
				isBlank = true;
				continue;
			}
			if (isBlank) {
				System.out.println("BOOM!!");
				return;
			}
			code = code * 10 + number;
		}
		System.out.println(code % 6 == 0 ? "BEER!!" : "BOOM!!");
	}
}