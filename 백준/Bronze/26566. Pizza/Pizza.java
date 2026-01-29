import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double[][] P = new double[2][2];
		double a, b;
		while (--N >= 0) {
			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 2; j++)
					P[i][j] = Integer.parseInt(st.nextToken());
			}
			a = P[0][0] / P[0][1];
			b = Math.PI * Math.pow(P[1][0], 2) / P[1][1];
			if (a > b)
				sb.append("Slice of pizza\n");
			else
				sb.append("Whole pizza\n");
		}
		System.out.print(sb);
	}
}