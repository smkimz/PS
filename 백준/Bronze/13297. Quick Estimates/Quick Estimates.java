import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[] X;
		while (--N >= 0) {
			X = br.readLine().toCharArray();
			sb.append(X.length).append("\n");
		}
		System.out.print(sb);
	}
}
