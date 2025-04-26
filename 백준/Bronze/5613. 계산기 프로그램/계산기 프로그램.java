import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br.readLine()), input;
		char sign;
		while (true) {
			sign = br.readLine().charAt(0);
			if (sign == '=')
				break;
			input = Integer.parseInt(br.readLine());
			if (sign == '+')
				res += input;
			else if (sign == '-')
				res -= input;
			else if (sign == '*')
				res *= input;
			else if (sign == '/')
				res /= input;
		}
		System.out.println(res);
	}
}
