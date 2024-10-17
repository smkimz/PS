import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), ans = 0;
		String S = st.nextToken(), name, chatting;
		HashMap<String, Integer> chattings = new HashMap<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			chatting = st.nextToken();
			if (name.equals(S)) {
				ans = chattings.getOrDefault(chatting, 0);
				break;
			}
			chattings.put(chatting, chattings.getOrDefault(chatting, 0) + 1);
		}
		System.out.println(ans);
	}
}