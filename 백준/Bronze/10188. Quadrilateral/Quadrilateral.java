import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), l, w;
		String line;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			line = "";
			for (int i = 0; i < l; i++)
				line += 'X';
			for (int i = 0; i < w; i++)
				sb.append(line).append("\n");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}