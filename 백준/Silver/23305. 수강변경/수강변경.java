import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = N;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] lectures = new int[1000001];
		for (int i = 0; i < N; i++)
			++lectures[Integer.parseInt(st.nextToken())];
		st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			if (--lectures[Integer.parseInt(st.nextToken())] < 0)
				continue;
			--ans;
		}
		System.out.println(ans);
	}
}