import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Boolean> dancers = new HashMap<String, Boolean>();
		dancers.put("ChongChong", true);
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		String A, B;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			A = st.nextToken();
			B = st.nextToken();
			if (dancers.getOrDefault(A, false) & !dancers.getOrDefault(B, false))
				dancers.put(B, true);
			else if (!dancers.getOrDefault(A, false) & dancers.getOrDefault(B, false))
				dancers.put(A, true);
		}
		System.out.println(dancers.size());
	}
}