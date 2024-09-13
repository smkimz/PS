import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> cats = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			cats.add(Integer.parseInt(st.nextToken()));
		Collections.sort(cats);
		int left = 0, right = N - 1, weight, ans = 0;
		while (left < right) {
			weight = cats.get(left) + cats.get(right);
			if (weight <= K) {
				++ans;
				++left;
			}
			--right;
		}
		System.out.println(ans);
	}
}