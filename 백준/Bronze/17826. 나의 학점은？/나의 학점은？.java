import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] ranking = { 0, 6, 16, 31, 36, 46, 49 };
		String[] credit = { "A+", "A0", "B+", "B0", "C+", "C0", "F" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 50; i++)
			pqueue.add(Integer.parseInt(st.nextToken()));
		int score = Integer.parseInt(br.readLine());
		for (int i = 50; i >= 1; i--) {
			if (pqueue.poll() != score)
				continue;
			for (int j = 6; j >= 0; j--) {
				if (i >= ranking[j]) {
					System.out.println(credit[j]);
					return;
				}
			}
		}
	}
}