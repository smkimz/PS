import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), Y = 0, Z = -1;
		LinkedList<String>[] names = new LinkedList[N];
		HashMap<String, Integer> rings = new HashMap<>();
		for (int i = 0; i < N; i++)
			names[i] = new LinkedList<>();
		String P, S;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			P = st.nextToken();
			S = st.nextToken();
			if (S.startsWith("-"))
				continue;
			if (rings.containsKey(S))
				names[rings.get(S)].add(P);
			else {
				rings.put(S, ++Z);
				names[Z].add(S);
				names[Z].add(P);
			}
		}
		for (int i = 0; i < names.length; i++) {
			if (names[i].size() != 3)
				continue;
			++Y;
			sb.append(names[i].get(1)).append(" ").append(names[i].get(2)).append("\n");
		}
		System.out.println(Y);
		System.out.print(sb);
	}
}