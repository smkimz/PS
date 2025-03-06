import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<String>[] goals = new PriorityQueue[9];
		for (int i = 0; i < 9; i++)
			goals[i] = new PriorityQueue<>();
		PriorityQueue<Goal> finalGoals = new PriorityQueue<>();
		StringTokenizer st;
		int num;
		String goal;
		Goal finalGoal;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				num = (i / 3) * 3 + (j / 3);
				goal = st.nextToken();
				if (num == 4)
					continue;
				else if (i % 3 == 1 && j % 3 == 1)
					finalGoals.add(new Goal(goal, num));
				else
					goals[num].add(goal);
			}
		}
		for (int i = 1; i <= 8; i++) {
			finalGoal = finalGoals.poll();
			sb.append("#").append(i).append(". ").append(finalGoal.goal).append("\n");
			for (int j = 1; j <= 8; j++) {
				sb.append("#").append(i).append("-").append(j).append(". ").append(goals[finalGoal.num].poll())
						.append("\n");
			}
		}
		System.out.print(sb);
	}

	static class Goal implements Comparable<Goal> {
		String goal;
		int num;

		public Goal(String goal, int num) {
			this.goal = goal;
			this.num = num;
		}

		@Override
		public int compareTo(Goal o) {
			return this.goal.compareTo(o.goal);
		}
	}
}