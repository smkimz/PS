import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), distance, sum = 0, max = 0;
		int[][] coordinates = new int[N + 2][2];
		int[] distances = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		coordinates[0][0] = Integer.parseInt(st.nextToken());
		coordinates[0][1] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			coordinates[i][0] = Integer.parseInt(st.nextToken());
			coordinates[i][1] = Integer.parseInt(st.nextToken());
			distances[i] = Math.abs(coordinates[i][0] - coordinates[i - 1][0])
					+ Math.abs(coordinates[i][1] - coordinates[i - 1][1]);
			sum += distances[i];
		}
		for (int i = 1; i < N - 1; i++) {
			distance = Math.abs(coordinates[i + 1][0] - coordinates[i - 1][0])
					+ Math.abs(coordinates[i + 1][1] - coordinates[i - 1][1]);
			if (distances[i] + distances[i + 1] - distance <= max)
				continue;
			max = distances[i] + distances[i + 1] - distance;
		}
		System.out.println(sum - max);
	}
}