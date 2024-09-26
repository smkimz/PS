import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Problem implements Comparable<Problem> {
		int P, L, sort;

		public Problem(int P, int L, int sort) {
			this.P = P;
			this.L = L;
			this.sort = sort;
		}

		@Override
		public int compareTo(Problem o) {
			if (this.L == o.L)
				return Integer.compare(this.P, o.P) * sort;
			return Integer.compare(this.L, o.L) * sort;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), P, L;
		PriorityQueue<Problem>[] problems = new PriorityQueue[2];
		HashMap<Integer, Integer> checker = new HashMap<>();
		problems[0] = new PriorityQueue<>();
		problems[1] = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			problems[0].add(new Problem(P, L, -1));
			problems[1].add(new Problem(P, L, 1));
			checker.put(P, L);
		}

		int M = Integer.parseInt(br.readLine()), x;
		char cmd;
		Problem problem;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken().charAt(0);
			if (cmd == 'a') {
				P = Integer.parseInt(st.nextToken());
				L = Integer.parseInt(st.nextToken());
				problems[0].add(new Problem(P, L, -1));
				problems[1].add(new Problem(P, L, 1));
				checker.put(P, L);
			} else if (cmd == 's') {
				checker.remove(Integer.parseInt(st.nextToken()));
			} else {
				if (st.nextToken().charAt(0) == '-')
					x = 1;
				else
					x = 0;
				while (!problems[x].isEmpty()) {
					problem = problems[x].poll();
					if (checker.containsKey(problem.P) && checker.get(problem.P) == problem.L) {
						sb.append(problem.P).append("\n");
						problems[x].add(problem);
						break;
					}
				}
			}
		}

		System.out.print(sb);
	}
}