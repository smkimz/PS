import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), ans = 0;
		if (A % 2 == 0 && A != B) {
			++A;
			++ans;
		}
		ans += (B - A) / 2 + 1;
		System.out.println(ans);
	}
}