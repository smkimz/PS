import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		TreeMap<String, Integer> extensions = new TreeMap<String, Integer>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String ext;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine(), ".");
			st.nextToken();
			ext = st.nextToken();
			extensions.put(ext, extensions.getOrDefault(ext, 0) + 1);
		}
		while (!extensions.isEmpty()) {
			sb.append(extensions.firstKey()).append(" ").append(extensions.get(extensions.firstKey())).append("\n");
			extensions.remove(extensions.firstKey());
		}
		System.out.print(sb);
	}
}