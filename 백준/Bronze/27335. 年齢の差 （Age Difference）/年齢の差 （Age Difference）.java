import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), max = -1, min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}
		for (int i = 0; i < N; i++)
			sb.append(Math.max(Math.abs(arr[i] - max), Math.abs(arr[i] - min))).append("\n");
		System.out.print(sb);
	}
}