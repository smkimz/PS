import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, len, ans = 1;
		int[] B = new int[N];
		for (int i = 0; i < N; i++)
			B[i] = Integer.parseInt(br.readLine());
		HashSet<Integer> capacities = new HashSet<>();
		for (int i = 0; i < N; i++) {
			if (capacities.contains(B[i]))
				continue;
			capacities.add(B[i]);
			len = 1;
			x = B[0];
			for (int j = 1; j < N; j++) {
				if (B[j] == B[i])
					continue;
				if (B[j] == x)
					++len;
				else {
					ans = Math.max(ans, len);
					len = 1;
				}
				x = B[j];
			}
			ans = Math.max(ans, len);
		}
		System.out.println(ans);
	}
}