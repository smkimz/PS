import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.charAt(0) == '+' || str.charAt(str.length() - 1) == '+') {
			System.out.println("No Money");
			return;
		}
		boolean plus = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				continue;
			else if (str.charAt(i) == '+') {
				if (!plus) {
					plus = true;
					continue;
				}
			}
			System.out.println("No Money");
			return;
		}
		if (!plus) {
			System.out.println("No Money");
			return;
		}
		String[] nums = str.split("\\+");
		if (nums[0].charAt(0) == '0' || nums[1].charAt(0) == '0') {
			System.out.println("No Money");
			return;
		}
		if (Integer.parseInt(nums[0]) != Integer.parseInt(nums[1]))
			System.out.println("No Money");
		else
			System.out.println("CUTE");
	}
}