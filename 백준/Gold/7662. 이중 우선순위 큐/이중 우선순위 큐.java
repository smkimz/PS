import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		TreeMap<Integer, Integer> Q;
		int T = Integer.parseInt(br.readLine()), K, N, val;
		char order;
		while (--T >= 0) {
			K = Integer.parseInt(br.readLine());
			Q = new TreeMap<>();
			while (--K >= 0) {
				st = new StringTokenizer(br.readLine());
				order = st.nextToken().charAt(0);
				N = Integer.parseInt(st.nextToken());
				if (order == 'I')
					Q.put(N, Q.getOrDefault(N, 0) + 1);
				else {
					if (Q.size() == 0)
						continue;
					if (N == 1)
						val = Q.lastKey();
					else
						val = Q.firstKey();
					Q.put(val, Q.get(val) - 1);
					if (Q.get(val) == 0)
						Q.remove(val);
				}
			}
			if (Q.size() == 0)
				sb.append("EMPTY");
			else
				sb.append(Q.lastKey()).append(" ").append(Q.firstKey());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}