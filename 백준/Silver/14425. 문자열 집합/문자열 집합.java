import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans = 0;
		HashMap<String, Boolean> words = new HashMap<>();
		while (--N >= 0)
			words.put(br.readLine(), true);
		while (--M >= 0)
			ans += words.getOrDefault(br.readLine(), false) ? 1 : 0;
		System.out.println(ans);
	}
}