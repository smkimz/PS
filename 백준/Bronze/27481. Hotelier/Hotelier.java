import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] r = new boolean[10];
		int n = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();
		for (int i = 0; i < n; i++) {
			if (c[i] >= '0' && c[i] <= '9')
				r[c[i] - '0'] = false;
			else {
				if (c[i] == 'L') {
					for (int j = 0; j <= 9; j++) {
						if (!r[j]) {
							r[j] = true;
							break;
						}
					}
				} else {
					for (int j = 9; j >= 0; j--) {
						if (!r[j]) {
							r[j] = true;
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i <= 9; i++)
			sb.append(r[i] ? 1 : 0);
		System.out.print(sb);
	}
}