import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++)
			ans += Math.min(Integer.parseInt(st.nextToken()), N);
		System.out.println(ans);
	}
}
