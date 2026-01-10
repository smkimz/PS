import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken()), l = Math.max(X, Y),
				d = Math.abs(X - Y);
		for (int i = 0; i < d; i++)
			sb.append(1);
		for (int i = d; i < l; i++)
			sb.append(2);
		System.out.print(sb);
	}
}
