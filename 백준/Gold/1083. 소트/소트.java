import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), S, idx = 0, max, maxIdx, maxVal;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(br.readLine());
		while (S > 0 && idx < N) {
			max = arr[idx];
			maxIdx = idx;
			for (int i = idx + 1; i <= Math.min(N - 1, idx + S); i++) {
				if (arr[i] > max) {
					max = Math.max(max, arr[i]);
					maxIdx = i;
				}
			}
			if (idx < maxIdx) {
				maxVal = arr[maxIdx];
				arr[maxIdx] = arr[maxIdx - 1];
				for (int i = maxIdx; i > idx; i--)
					arr[i] = arr[i - 1];
				arr[idx] = maxVal;
				S -= maxIdx - idx;
			}
			++idx;
		}
		for (int i = 0; i < N - 1; i++)
			sb.append(arr[i]).append(" ");
		System.out.print(sb.append(arr[N - 1]));
	}
}