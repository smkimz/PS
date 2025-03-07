import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()),
				N = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()), size = 0, max = 0;
		char cmd;
		while (--N >= 0) {
			cmd = br.readLine().charAt(0);
			if (cmd == '1') {
				++size;
				max = Math.max(max, size);
			} else
				--size;
		}
		while (S < max)
			S *= 2;
		System.out.println(S);
	}
}