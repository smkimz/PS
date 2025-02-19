import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), ans;
		char[] A, B;
		int[] count;
		for (int t = 1; t <= N; t++) {
			A = br.readLine().toCharArray();
			B = br.readLine().toCharArray();
			count = new int[26];
			ans = 0;
			for (int i = 0; i < A.length; i++)
				++count[A[i] - 'a'];
			for (int i = 0; i < B.length; i++)
				--count[B[i] - 'a'];
			for (int i = 0; i < 26; i++)
				ans += Math.abs(count[i]);
			sb.append("Case #").append(t).append(": ").append(ans).append("\n");
		}
		System.out.print(sb);
	}
}