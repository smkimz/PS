import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer A = new StringTokenizer(br.readLine());
		String B = br.readLine(), X;
		int ans = 0;
		while (A.hasMoreTokens()) {
			X = A.nextToken();
			if (X.startsWith(B) && X.length() > B.length())
				++ans;
		}
		System.out.println(ans);
	}
}