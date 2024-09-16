import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, x, y, ans;
		StringTokenizer st;
		HashMap<String, Integer> clothes;
		int[] count;
		String clothe;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			clothes = new HashMap<>();
			count = new int[N];
			ans = 1;
			x = 0;
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				clothe = st.nextToken();
				if (!clothes.containsKey(clothe)) {
					clothes.put(clothe, x);
					++count[x++];
				} else {
					y = clothes.get(clothe);
					++count[y];
				}
			}
			for (int i = 0; i < x; i++)
				ans *= count[i] + 1;
			sb.append(ans - 1).append("\n");
		}
		System.out.print(sb);
	}
}