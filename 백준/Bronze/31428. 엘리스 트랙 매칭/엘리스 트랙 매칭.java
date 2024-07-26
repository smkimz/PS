import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		char T = br.readLine().charAt(0);
		while (--N >= 0) {
			if (st.nextToken().charAt(0) == T)
				++ans;
		}
		System.out.println(ans);
	}
}