import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), time = 1, maxCongestion = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> students = new PriorityQueue<>(Collections.reverseOrder()),
				cafeteria = new PriorityQueue<>();
		while (--N >= 0)
			students.add(Integer.parseInt(st.nextToken()));
		while (!students.isEmpty()) {
			cafeteria.add(time + students.poll());
			while (!cafeteria.isEmpty() && cafeteria.peek() == time)
				cafeteria.poll();
			maxCongestion = Math.max(maxCongestion, cafeteria.size());
			++time;
		}
		System.out.println(maxCongestion);
	}
}