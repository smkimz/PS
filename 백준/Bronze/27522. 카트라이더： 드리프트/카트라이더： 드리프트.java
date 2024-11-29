import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		PriorityQueue<Player> players = new PriorityQueue<>();
		String[] time;
		char team;
		int[] scoreTable = new int[] { 10, 8, 6, 5, 4, 3, 2, 1, 0 };
		int rScore = 0, bScore = 0;
		Player p;
		for (int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			time = st.nextToken().split(":");
			team = st.nextToken().charAt(0);
			players.add(new Player(team,
					Integer.parseInt(time[0]) * 60000 + Integer.parseInt(time[1]) * 1000 + Integer.parseInt(time[2])));
		}
		for (int i = 0; i < 8; i++) {
			p = players.poll();
			if (p.team == 'R')
				rScore += scoreTable[i];
			else
				bScore += scoreTable[i];
		}
		System.out.println(rScore > bScore ? "Red" : "Blue");
	}

	static class Player implements Comparable<Player> {
		char team;
		int time;

		public Player(char team, int time) {
			this.team = team;
			this.time = time;
		}

		@Override
		public int compareTo(Player o) {
			return Integer.compare(this.time, o.time);
		}
	}
}