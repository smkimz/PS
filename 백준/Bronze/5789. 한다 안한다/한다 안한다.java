import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l;
		char[] S;
		while (--N >= 0) {
			S = br.readLine().toCharArray();
			l = S.length;
			sb.append("Do-it").append(S[l / 2] == S[(l - 1) / 2] ? "\n" : "-Not\n");
		}
		System.out.print(sb);
	}
}
