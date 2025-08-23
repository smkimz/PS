import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), sum, totalSum = 0, max = 0;
		char[] input;
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			for (int j = 0; j < M; j++) {
				input = st.nextToken().toCharArray();
				for (int k = 0; k < input.length; k++) {
					if (input[k] == '9')
						++arr[i][j];
				}
				sum += arr[i][j];
			}
			totalSum += sum;
			max = Math.max(max, sum);
		}
		for (int i = 0; i < M; i++) {
			sum = 0;
			for (int j = 0; j < N; j++)
				sum += arr[j][i];
			max = Math.max(max, sum);
		}
		System.out.println(totalSum - max);
	}
}