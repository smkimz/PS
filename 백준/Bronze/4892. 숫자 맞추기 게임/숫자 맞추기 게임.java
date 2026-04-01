import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = 0, n;
		boolean isEven;
		while (true) {
			++t;
			n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			n *= 3;
			isEven = n % 2 == 0 ? true : false;
			n = isEven ? n / 2 : (n + 1) / 2;
			n *= 3;
			n /= 9;
			sb.append(t).append(". ").append(isEven ? "even" : "odd").append(' ').append(n).append("\n");
		}
		System.out.print(sb);
	}
}