import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num;
		for (int i = 3; i >= 1; i--) {
			str = br.readLine();
			if (str.contains("Fizz") || str.contains("Buzz"))
				continue;
			num = Integer.valueOf(str) + i;
			if (num % 3 == 0 && num % 5 == 0)
				System.out.println("FizzBuzz");
			else if (num % 3 == 0)
				System.out.println("Fizz");
			else if (num % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(num);
			break;
		}
	}
}