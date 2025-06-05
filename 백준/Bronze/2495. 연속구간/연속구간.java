import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int seq, ret;
		char prev;
		char[] S;
		for (int i = 0; i < 3; i++) {
			S = br.readLine().toCharArray();
			prev = S[0];
			seq = 1;
			ret = 1;
			for (int j = 1; j < 8; j++) {
				if (S[j] == prev) {
					++seq;
					ret = Math.max(ret, seq);
				} else {
					seq = 1;
					prev = S[j];
				}
			}
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}