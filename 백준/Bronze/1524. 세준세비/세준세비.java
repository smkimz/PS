import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, M, idxA, idxB;
		int[][] soldiers = new int[2][];
		while (--T >= 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			soldiers[0] = new int[N];
			soldiers[1] = new int[M];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				soldiers[0][i] = Integer.parseInt(st.nextToken());
			Arrays.sort(soldiers[0]);
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++)
				soldiers[1][i] = Integer.parseInt(st.nextToken());
			Arrays.sort(soldiers[1]);
			idxA = 0;
			idxB = 0;
			while (idxA < N && idxB < M) {
				if (soldiers[0][idxA] < soldiers[1][idxB])
					++idxA;
				else
					++idxB;
			}
			if (idxA == N)
				sb.append("B");
			else
				sb.append("S");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}