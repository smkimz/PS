import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), len;
		while (--N >= 0) {
			len = br.readLine().toCharArray().length;
			sb.append(len >= 6 && len <= 9 ? "yes\n" : "no\n");
		}
		System.out.print(sb);
	}
}