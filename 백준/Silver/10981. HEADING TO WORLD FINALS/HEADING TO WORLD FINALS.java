import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		PriorityQueue<Team> teams = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			teams.add(new Team(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())));
		}
		Team team;
		HashSet<String> schools = new HashSet<>();
		while (!teams.isEmpty() && K > 0) {
			team = teams.poll();
			if (schools.contains(team.school))
				continue;
			schools.add(team.school);
			sb.append(team.name).append("\n");
			--K;
		}
		System.out.print(sb);
	}

	static class Team implements Comparable<Team> {
		String school, name;
		int sol, panalty;

		public Team(String school, String name, int sol, int panalty) {
			this.school = school;
			this.name = name;
			this.sol = sol;
			this.panalty = panalty;
		}

		@Override
		public int compareTo(Team o) {
			if (this.sol == o.sol)
				return Integer.compare(this.panalty, o.panalty);
			return Integer.compare(o.sol, this.sol);
		}
	}
}