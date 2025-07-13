import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] C = new String[4], X = new String[4];
		for (int i = 0; i < 4; i++)
			C[i] = st.nextToken();
		boolean[] u = new boolean[4];
		String ret;
		long max = 0;
		for (int a = 0; a < 4; a++) {
			X[0] = C[a];
			u[a] = true;
			for (int b = 0; b < 4; b++) {
				if (u[b])
					continue;
				X[1] = C[b];
				u[b] = true;
				for (int c = 0; c < 4; c++) {
					if (u[c])
						continue;
					X[2] = C[c];
					u[c] = true;
					for (int d = 0; d < 4; d++) {
						if (u[d])
							continue;
						X[3] = C[d];
						ret = X[0] + X[1] + X[2] + X[3];
						max = Math.max(max, Long.parseLong(ret));
					}
					u[c] = false;
				}
				u[b] = false;
			}
			u[a] = false;
		}
		System.out.println(max);
	}
}