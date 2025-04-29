import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), cost = 0, count = 0;
		ArrayDeque<Integer> costs = new ArrayDeque<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			if (st.nextToken().equals("jinju"))
				cost = Integer.parseInt(st.nextToken());
			else
				costs.add(Integer.parseInt(st.nextToken()));
		}
		while (!costs.isEmpty()) {
			if (costs.poll() > cost)
				++count;
		}
		System.out.printf("%d\n%d", cost, count);
	}
}
