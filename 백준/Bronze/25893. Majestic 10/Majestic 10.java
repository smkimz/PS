import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String[] ret = new String[] {"zilch", "double", "double-double", "triple-double"};
		int N = Integer.parseInt(br.readLine()), cnt, x;
		while(--N >= 0) {
			st = new StringTokenizer(br.readLine());cnt = 0;
			for(int i = 0; i < 3; i++) {
				x = Integer.parseInt(st.nextToken());
				sb.append(x).append(' ');
				if(x >= 10)
					++cnt;
			}
			sb.append("\n").append(ret[cnt]).append("\n\n");
		}
		System.out.print(sb);
	}
}