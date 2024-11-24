import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N = 3;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		PriorityQueue<Member> pqueue = new PriorityQueue<>();
		int[] year = new int[N];
		int sol;
		String name;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			sol = Integer.parseInt(st.nextToken());
			year[i] = Integer.parseInt(st.nextToken());
			name = st.nextToken();
			pqueue.add(new Member(name, sol));
		}
		Arrays.sort(year);
		for (int i = 0; i < N; i++)
			sb.append(year[i] % 100);
		sb.append("\n");
		for (int i = 0; i < N; i++)
			sb.append(pqueue.poll().name.charAt(0));
		System.out.print(sb);
	}

	static class Member implements Comparable<Member> {
		String name;
		int sol;

		public Member(String name, int sol) {
			this.name = name;
			this.sol = sol;
		}

		@Override
		public int compareTo(Main.Member o) {
			return Integer.compare(o.sol, this.sol);
		}
	}
}