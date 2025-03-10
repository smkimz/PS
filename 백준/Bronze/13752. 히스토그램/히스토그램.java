import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = "==========", b = "=";
		int n = Integer.parseInt(br.readLine()), k;
		while (--n >= 0) {
			k = Integer.parseInt(br.readLine());
			for (int i = 0; i < k / 10; i++)
				sb.append(a);
			for (int i = 0; i < k % 10; i++)
				sb.append(b);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}