import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), diff, maxDiff = 5;
		String prob, maxDiffProb = "";
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			prob = st.nextToken();
			diff = Integer.parseInt(st.nextToken());
			if (diff < maxDiff) {
				maxDiffProb = prob;
				maxDiff = diff;
			}
		}
		System.out.println(maxDiffProb);
	}
}