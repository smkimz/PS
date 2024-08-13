import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()),
				N = Integer.parseInt(st.nextToken()), cntA = 0, cntB = 0;
		char[] arr = br.readLine().toCharArray();
		boolean checker = false;
		for (int i = 0; i < N; i++) {
			if (arr[i] == '1') {
				++cntA;
				cntB = 0;
				if (cntA >= K)
					checker = true;
				continue;
			}
			++cntB;
			cntA = 0;
			if (!checker || cntB < L)
				continue;
			checker = false;
			sb.append(i + 1).append("\n");
		}
		if (checker)
			sb.append(N + L - cntB);
		if (sb.length() == 0)
			System.out.println("NIKAD");
		else
			System.out.print(sb);
	}
}