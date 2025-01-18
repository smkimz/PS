import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		int[] T = new int[3];
		StringTokenizer st;
		p: while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i <= 2; i++)
				T[i] = Integer.parseInt(st.nextToken());
			if (T[0] == -1)
				continue;
			for (int i = 2; i >= 1; i--) {
				if (T[i] == -1)
					continue;
				for (int j = i - 1; j >= 0; j--) {
					if (T[i] < T[j] || T[j] == -1)
						continue p;
				}
			}
			++ans;
		}
		System.out.println(ans);
	}
}