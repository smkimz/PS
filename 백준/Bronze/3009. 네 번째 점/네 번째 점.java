import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] x = new int[3], y = new int[3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x);
		Arrays.sort(y);
		if (x[0] == x[1])
			sb.append(x[2]);
		else
			sb.append(x[0]);
		sb.append(" ");
		if (y[0] == y[1])
			sb.append(y[2]);
		else
			sb.append(y[0]);
		System.out.print(sb);
	}
}