import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] X = br.readLine().toCharArray();
		int val = X[0] - '0', count = 0;
		while (X.length > 1) {
			++count;
			val = 0;
			for (int i = 0; i < X.length; i++)
				val += X[i] - '0';
			X = Integer.toString(val).toCharArray();
		}
		sb.append(count).append("\n");
		if (val % 3 == 0)
			sb.append("YES");
		else
			sb.append("NO");
		System.out.print(sb);
	}
}