import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, String> list = new HashMap<String, String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		String x, y;
		while (--N >= 0) {
			x = br.readLine();
			st = new StringTokenizer(x);
			y = st.nextToken().charAt(0) + "" + st.nextToken().charAt(0);
			if (list.containsKey(y))
				list.put(y, "ambiguous");
			else
				list.put(y, x);
		}
		while (--M >= 0)
			sb.append(list.getOrDefault(br.readLine(), "nobody")).append("\n");
		System.out.print(sb);
	}
}