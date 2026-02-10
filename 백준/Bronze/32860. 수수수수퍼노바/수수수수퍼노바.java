import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("SN ").append(st.nextToken());
		int M = Integer.parseInt(st.nextToken()) - 1;
		if (M < 26)
			sb.append((char) (M + 'A'));
		else {
			M -= 26;
			sb.append((char) ((M / 26) + 'a')).append((char) ((M % 26) + 'a'));
		}
		System.out.print(sb);
	}
}