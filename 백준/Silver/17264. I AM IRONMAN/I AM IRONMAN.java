import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken()), W, L, G, score = 0;
		st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		HashMap<String, Boolean> players = new HashMap<>();
		String player;
		while (--P >= 0) {
			st = new StringTokenizer(br.readLine());
			players.put(st.nextToken(), st.nextToken().charAt(0) == 'W' ? true : false);
		}
		while (--N >= 0) {
			player = br.readLine();
			if (!players.containsKey(player) || !players.get(player)) {
				score -= L;
				if (score < 0)
					score = 0;
			} else
				score += W;
			if (score >= G) {
				System.out.println("I AM NOT IRONMAN!!");
				return;
			}
		}
		System.out.println("I AM IRONMAN!!");
	}
}