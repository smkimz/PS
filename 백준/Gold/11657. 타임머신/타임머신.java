import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static Bus[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		adjList = new Bus[M];
		int start, end;
		long time;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			time = Long.parseLong(st.nextToken());
			adjList[i] = new Bus(start, end, time);
		}
		bellmanFord();
	}

	static void bellmanFord() {
		StringBuilder sb = new StringBuilder();
		long[] timeArr = new long[N + 1];
		Arrays.fill(timeArr, Long.MAX_VALUE);
		timeArr[1] = 0;
		int start, end;
		long time;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < M; j++) {
				start = adjList[j].start;
				end = adjList[j].end;
				time = adjList[j].time;
				if (timeArr[start] != Long.MAX_VALUE && timeArr[end] > timeArr[start] + time)
					timeArr[end] = timeArr[start] + time;
			}
		}
		for (int i = 0; i < M; i++) {
			start = adjList[i].start;
			end = adjList[i].end;
			time = adjList[i].time;
			if (timeArr[start] != Long.MAX_VALUE && timeArr[end] > timeArr[start] + time) {
				System.out.println(-1);
				return;
			}
		}
		for (int i = 2; i <= N; i++) {
			if (timeArr[i] == Long.MAX_VALUE)
				sb.append(-1).append("\n");
			else
				sb.append(timeArr[i]).append("\n");
		}
		System.out.print(sb);
	}

	static class Bus {
		int start, end;
		long time;

		public Bus(int start, int end, long time) {
			this.start = start;
			this.end = end;
			this.time = time;
		}
	}
}