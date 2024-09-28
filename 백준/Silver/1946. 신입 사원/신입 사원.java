import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, R, ans;
		StringTokenizer st;
		PriorityQueue<int[]> employees;
		int[] employee;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			R = 100000;
			ans = 0;
			employees = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] == o2[0])
						return Integer.compare(o2[1], o1[1]);
					return Integer.compare(o1[0], o2[0]);
				}
			});

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				employees.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
			}

			while (--N >= 0) {
				employee = employees.poll();
				if (employee[1] > R)
					continue;
				++ans;
				R = Math.min(R, employee[1]);
			}

			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}