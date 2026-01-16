import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		boolean[] ck = new boolean[5];
		for (int i = 0; i < 10; i++)
			ck[Integer.parseInt(st.nextToken())] = true;
		for (int i = 1; i <= 4; i++)
			ans += ck[i] ? 0 : 1;
		System.out.println(ans);
	}
}