import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()),
				ZR = Integer.parseInt(st.nextToken()), ZC = Integer.parseInt(st.nextToken());
		char[] newspaper;
		String result;
		for (int i = 0; i < R; i++) {
			newspaper = br.readLine().toCharArray();
			result = "";
			for (int j = 0; j < C; j++) {
				result += newspaper[j];
				for (int k = 1; k < ZC; k++)
					result += newspaper[j];
			}
			for (int j = 0; j < ZR; j++)
				sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}