import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int X = Integer.parseInt(st.nextToken()), N = Integer.parseInt(br.readLine()), K, A;
		boolean isValid;
		while (--N >= 0) {
			K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			isValid = false;
			while (--K >= 0) {
				A = Integer.parseInt(st.nextToken());
				if (A == X) {
					isValid = true;
					break;
				}
			}
			if (!isValid) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}