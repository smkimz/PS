import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] S = br.readLine().toCharArray(), korea = new char[] { 'K', 'O', 'R', 'E', 'A' },
				yonsei = new char[] { 'Y', 'O', 'N', 'S', 'E', 'I' };
		int y = 0, k = 0, i = -1;
		while (++i < S.length && y < 6 && k < 5) {
			y += S[i] == yonsei[y] ? 1 : 0;
			k += S[i] == korea[k] ? 1 : 0;
		}
		System.out.println(y == 6 ? "YONSEI" : "KOREA");
	}
}