import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static class Doc {
		int num, prior;

		public Doc(int num, int prior) {
			this.num = num;
			this.prior = prior;
		}
	}

	static StringBuilder sb = new StringBuilder();
	static int M, max;
	static int[] priority;
	static ArrayDeque<Doc> queue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			max = 9;
			priority = new int[10];
			queue = new ArrayDeque<>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int p = Integer.parseInt(st.nextToken());
				queue.add(new Doc(i, p));
				++priority[p];
			}
			findHighestPriority();
			printQueue();
		}

		System.out.print(sb);
	}

	static void printQueue() {
		int count = 1;
		Doc doc;
		while (!queue.isEmpty()) {
			doc = queue.poll();
			if (doc.num == M) {
				if (doc.prior == max) {
					sb.append(count).append("\n");
					return;
				} else
					queue.add(doc);
			} else {
				if (doc.prior == max) {
					--priority[doc.prior];
					++count;
					if (priority[doc.prior] == 0)
						findHighestPriority();
				} else
					queue.add(doc);
			}
		}
	}

	static void findHighestPriority() {
		for (int i = max; i >= 1; i--) {
			if (priority[i] > 0) {
				max = i;
				return;
			}
		}
	}
}