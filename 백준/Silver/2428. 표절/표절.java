import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), left, right, mid = 0;
		long ans = 0;
		double[] docs = new double[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			docs[i] = Double.parseDouble(st.nextToken());
		Arrays.sort(docs);
		for (int i = 0; i < N; i++) {
			left = i;
			right = N - 1;
			while (left <= right) {
				mid = (left + right) / 2;
				if (docs[mid] * 0.9 <= docs[i])
					left = mid + 1;
				else
					right = mid - 1;
			}
			ans += left - i - 1;
		}
		System.out.println(ans);
	}
}