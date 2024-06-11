import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Boolean> peoples = new HashMap<String, Boolean>();
		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		String people;
		while (N-- > 0)
			peoples.put(br.readLine(), true);
		while (M-- > 0) {
			people = br.readLine();
			if (!peoples.getOrDefault(people, false))
				continue;
			pqueue.add(people);
		}
		sb.append(pqueue.size()).append("\n");
		while (!pqueue.isEmpty())
			sb.append(pqueue.poll()).append("\n");
		System.out.print(sb);
	}
}
