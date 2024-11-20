import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken());
		int[] maxAssets = new int[Y + 1];
		maxAssets[0] = H;
		for (int i = 1; i <= Y; i++) {
			maxAssets[i] = (int) Math.max(maxAssets[i - 1] * 1.05, maxAssets[i]);
			if (i >= 3)
				maxAssets[i] = (int) Math.max(maxAssets[i - 3] * 1.2, maxAssets[i]);
			if (i >= 5)
				maxAssets[i] = (int) Math.max(maxAssets[i - 5] * 1.35, maxAssets[i]);
		}
		System.out.println(maxAssets[Y]);
	}
}