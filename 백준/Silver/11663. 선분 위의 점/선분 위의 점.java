import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x, y, z, left, right, mid;
		int[] coordinates = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			pqueue.add(Integer.parseInt(st.nextToken()));
		for (int i = 1; i <= N; i++)
			coordinates[i] = pqueue.poll();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			left = 1;
			right = N;
			while (left <= right) {
				mid = (left + right) / 2;
				if (coordinates[mid] < x)
					left = mid + 1;
				else
					right = mid - 1;
			}
			z = left;
			left = 1;
			right = N;
			while (left <= right) {
				mid = (left + right) / 2;
				if (coordinates[mid] > y)
					right = mid - 1;
				else
					left = mid + 1;
			}
			sb.append(left - z).append("\n");
		}
		System.out.print(sb);
	}
}