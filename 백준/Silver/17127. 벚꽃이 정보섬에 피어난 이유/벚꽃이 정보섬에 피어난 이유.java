import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[] mult = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		mult[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++)
			mult[i] = mult[i - 1] * Integer.parseInt(st.nextToken());
		for (int a = 0; a < N - 3; a++) {
			for (int b = a + 1; b < N - 2; b++) {
				for (int c = b + 1; c < N - 1; c++)
					max = Math.max(max, mult[a] + (mult[b] / mult[a]) + (mult[c] / mult[b]) + (mult[N - 1] / mult[c]));
			}
		}
		System.out.println(max);
	}
}