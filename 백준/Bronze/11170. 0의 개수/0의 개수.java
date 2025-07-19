import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, M, cnt;
		int[] cntArr = new int[1000001];
		cntArr[0] = 1;
		char[] num;
		for (int i = 1; i <= 1000000; i++) {
			num = String.valueOf(i).toCharArray();
			cnt = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == '0')
					++cnt;
			}
			cntArr[i] = cntArr[i - 1] + cnt;
		}
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			if (N == 0)
				sb.append(cntArr[M]);
			else
				sb.append(cntArr[M] - cntArr[N - 1]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}