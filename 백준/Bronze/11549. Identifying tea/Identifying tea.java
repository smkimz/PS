import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char T = br.readLine().charAt(0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			if (T == st.nextToken().charAt(0))
				++ans;
		}
		System.out.println(ans);
	}
}