import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken()) - 1, N = Integer.parseInt(st.nextToken()), x, sol = 0;
		long panalty = 0;
		PriorityQueue<Integer> problems = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			problems.add(Integer.parseInt(st.nextToken()));
		while (!problems.isEmpty()) {
			x = problems.poll();
			if (P < x)
				break;
			panalty += P;
			P -= x;
			++sol;
		}
		System.out.printf("%d %d", sol, panalty);
	}
}