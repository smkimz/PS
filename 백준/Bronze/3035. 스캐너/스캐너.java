import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder res = new StringBuilder(), sb;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()),
				ZR = Integer.parseInt(st.nextToken()), ZC = Integer.parseInt(st.nextToken());
		char[] newspaper;
		for (int i = 0; i < R; i++) {
			newspaper = br.readLine().toCharArray();
			sb = new StringBuilder();
			for (int j = 0; j < C; j++) {
				sb.append(newspaper[j]);
				for (int k = 1; k < ZC; k++)
					sb.append(newspaper[j]);
			}
			for (int j = 0; j < ZR; j++)
				res.append(sb).append("\n");
		}
		System.out.print(res);
	}
}