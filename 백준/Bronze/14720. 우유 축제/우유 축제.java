import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		char p = '-', q;
		HashMap<Character, Character> stores = new HashMap<Character, Character>();
		stores.put('-', '0');
		stores.put('0', '1');
		stores.put('1', '2');
		stores.put('2', '0');
		while (--N >= 0) {
			q = st.nextToken().charAt(0);
			if (stores.get(p) == q) {
				++ans;
				p = q;
			}
		}
		System.out.println(ans);
	}
}
