import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("\n");
		char[] X = br.readLine().toCharArray(), Y;
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		boolean f;
		while (--N >= 0) {
			Y = br.readLine().toCharArray();
			f = false;
			for (int i = 0; i < 9; i++) {
				if (X[i] == Y[i] || X[i] == '*')
					continue;
				f = true;
				break;
			}
			if (f)
				continue;
			sb.append(Y).append("\n");
			++cnt;
		}
		sb.insert(0, cnt);
		System.out.print(sb);
	}
}
