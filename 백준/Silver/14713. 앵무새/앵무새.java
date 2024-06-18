import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int N = Integer.parseInt(br.readLine()), num;
		Deque<String>[] dq = new ArrayDeque[N + 1];
		dq[0] = new ArrayDeque<>();
		StringTokenizer st;
		String word;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			dq[i] = new ArrayDeque<>();
			while (st.hasMoreTokens()) {
				word = st.nextToken();
				dq[i].add(word);
				hm.put(word, i);
			}
		}
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			word = st.nextToken();
			num = hm.getOrDefault(word, 0);
			if (dq[num].isEmpty() || !dq[num].peek().equals(word)) {
				System.out.println("Impossible");
				return;
			}
			dq[num].poll();
		}
		for (int i = 1; i <= N; i++) {
			if (dq[i].isEmpty())
				continue;
			System.out.println("Impossible");
			return;
		}
		System.out.println("Possible");
	}
}
