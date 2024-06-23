import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), I = Integer.parseInt(st.nextToken());
		PriorityQueue<String> pq = new PriorityQueue<String>();
		while (N-- > 0)
			pq.add(br.readLine());
		for (int i = 0; i < I - 1; i++)
			pq.poll();
		System.out.println(pq.poll());
	}
}
