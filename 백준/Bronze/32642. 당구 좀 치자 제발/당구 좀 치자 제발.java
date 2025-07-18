import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long rage = 0, ans = 0;
		char rain;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			rain = st.nextToken().charAt(0);
			rage += rain == '0' ? -1 : 1;
			ans += rage;
		}
		System.out.println(ans);
	}
}