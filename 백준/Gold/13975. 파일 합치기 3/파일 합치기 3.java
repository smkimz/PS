import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		PriorityQueue<Long> pqueue = new PriorityQueue<>();
		int T = Integer.parseInt(br.readLine()), K;
		long newFile, ans;
		while (--T >= 0) {
			K = Integer.parseInt(br.readLine());
			ans = 0;
			st = new StringTokenizer(br.readLine());
			while (--K >= 0)
				pqueue.add(Long.parseLong(st.nextToken()));
			while (pqueue.size() > 1) {
				newFile = pqueue.poll();
				newFile += pqueue.poll();
				ans += newFile;
				pqueue.add(newFile);
			}
			sb.append(ans).append("\n");
			pqueue.clear();
		}
		System.out.print(sb);
	}
}