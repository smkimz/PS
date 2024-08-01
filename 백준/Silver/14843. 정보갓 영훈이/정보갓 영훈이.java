import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double score = 0, S, A, T, M;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			S = Double.parseDouble(st.nextToken());
			A = Double.parseDouble(st.nextToken());
			T = Double.parseDouble(st.nextToken());
			M = Double.parseDouble(st.nextToken());
			score += (1.0 + (1.0 / A)) * (1.0 + (M / T)) * S / 4.0;
		}
		int P = Integer.parseInt(br.readLine()), Q = (int) Math.floor((P + 1) * 0.15);
		double[] scores = new double[P];
		for (int i = 0; i < P; i++)
			scores[i] = Double.parseDouble(br.readLine());
		Arrays.sort(scores);
		sb.append("The total score of Younghoon ");
		DecimalFormat df = new DecimalFormat("#.00");
		if (scores[P - Q] < score)
			sb.append("\"The God\" ");
		sb.append("is ").append(df.format(score)).append(".");
		System.out.println(sb);
	}
}