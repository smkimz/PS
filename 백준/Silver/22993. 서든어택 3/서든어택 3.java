import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), Y;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long X = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> players = new PriorityQueue<>();
		while (--N > 0)
			players.add(Integer.parseInt(st.nextToken()));
		while (!players.isEmpty()) {
			Y = players.poll();
			if (X <= Y) {
				System.out.println("No");
				return;
			}
			X += Y;
			if (X > 1000000000)
				break;
		}
		System.out.println("Yes");
	}
}