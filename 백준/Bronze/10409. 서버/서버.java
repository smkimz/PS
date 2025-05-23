import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken()), ans = 0;
		st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			T -= Integer.parseInt(st.nextToken());
			if (T < 0)
				break;
			++ans;
		}
		System.out.println(ans);
	}
}