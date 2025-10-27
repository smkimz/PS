import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = Integer.parseInt(br.readLine());
		double[] A = new double[4];
		StringTokenizer st;
		while (--P >= 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(' ');
			for (int i = 0; i < 4; i++)
				A[i] = Double.parseDouble(st.nextToken());
			sb.append(A[0] / (A[1] + A[2]) * A[3]).append("\n");
		}
		System.out.print(sb);
	}
}
