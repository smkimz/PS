import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x = 0;

		ArrayList<Integer> students = new ArrayList<>();
		for (int i = 0; i < N; i++)
			students.add(Integer.parseInt(br.readLine()));
		Collections.sort(students);
		PriorityQueue<Problem> problems = new PriorityQueue<>();
		for (int i = 0; i < M; i++)
			problems.add(new Problem(i, Integer.parseInt(br.readLine())));
		int[] ans = new int[M];
		Arrays.fill(ans, -1);
		Problem problem;
		while (!problems.isEmpty()) {
			problem = problems.poll();
			while (x < N) {
				if (problem.val < students.get(x))
					break;
				if (problem.val == students.get(x)) {
					ans[problem.num] = x;
					break;
				}
				++x;
			}
		}
		for (int i = 0; i < M; i++)
			sb.append(ans[i]).append("\n");
		System.out.print(sb);
	}

	static class Problem implements Comparable<Problem> {
		int num, val;

		public Problem(int num, int val) {
			this.num = num;
			this.val = val;
		}

		@Override
		public int compareTo(Problem o) {
			return Integer.compare(this.val, o.val);
		}
	}
}