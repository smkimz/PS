import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] b = new boolean['E' + 1];
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		char[] S = br.readLine().toCharArray();
		for(int i = 0; i < N; i++) {
			cnt += b[S[i]] ? 0 : 1;
			b[S[i]] = true;
		}
		System.out.println(cnt >= 3 ? "Yes" : "No");
	}
}