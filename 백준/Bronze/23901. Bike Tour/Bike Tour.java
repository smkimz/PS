import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, ret;
		int[] H = new int[3];
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			ret = 0;
			st = new StringTokenizer(br.readLine());
			H[0] = Integer.parseInt(st.nextToken());
			H[1] = Integer.parseInt(st.nextToken());
			for (int i = 1; i < N - 1; i++) {
				H[2] = Integer.parseInt(st.nextToken());
				if (H[1] > H[0] && H[1] > H[2])
					++ret;
				H[0] = H[1];
				H[1] = H[2];
			}
			sb.append("Case #").append(t).append(": ").append(ret).append("\n");
		}
		System.out.print(sb);
	}
}
