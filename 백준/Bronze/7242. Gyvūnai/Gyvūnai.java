import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] T = new int[1260], ans = new int[4];
		int n = Integer.parseInt(br.readLine()), t, diff, animals = 0, max = 0;
		boolean isObservationTime = false;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				t = 0;
				for (int k = 1; k >= 0; k--)
					t += Math.pow(60, k) * Integer.parseInt(st.nextToken());
				T[t] += j == 0 ? 1 : -1;
			}
		}
		t = 0;
		for (int i = 540; i < 1260; i++) {
			animals += T[i];
			if (isObservationTime) {
				if (animals == n)
					continue;
				diff = i - t;
				if (diff > max)
					max = diff;
				ans[0] = t / 60;
				ans[1] = t % 60;
				ans[2] = i / 60;
				ans[3] = i % 60;
				isObservationTime = false;
			} else {
				if (animals != n)
					continue;
				t = i;
				isObservationTime = true;
			}
		}
		if (ans[0] == 0)
			System.out.println("NE");
		else
			System.out.printf("TAIP\n%d %d %d %d", ans[0], ans[1], ans[2], ans[3]);
	}
}