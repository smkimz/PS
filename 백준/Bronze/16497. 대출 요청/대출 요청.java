import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y = 0, max = 0;
		PriorityQueue<Integer> out = new PriorityQueue<>(), in = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			out.add(Integer.parseInt(st.nextToken()));
			in.add(Integer.parseInt(st.nextToken()));
		}
		x = Integer.parseInt(br.readLine());
		while (!out.isEmpty()) {
			if (out.peek() < in.peek()) {
				out.poll();
				y++;
				max = Math.max(max, y);
			} else {
				in.poll();
				y--;
			}
		}
		System.out.println(max > x ? 0 : 1);
	}
}