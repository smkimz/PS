import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), max = -1, num = 0;
		int[][] arr = new int[N + 1][5];
		int[] count = new int[N + 1];
		boolean[] isChecked;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i <= N; i++) {
			isChecked = new boolean[N + 1];
			for (int j = 0; j < 5; j++) {
				for (int k = i + 1; k <= N; k++) {
					if (arr[i][j] != arr[k][j] || isChecked[k])
						continue;
					++count[i];
					++count[k];
					isChecked[k] = true;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			if (count[i] > max) {
				max = count[i];
				num = i;
			}
		}
		System.out.println(num);
	}
}