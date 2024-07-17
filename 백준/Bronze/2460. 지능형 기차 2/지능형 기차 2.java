import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 0, max = 0;
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			cnt -= Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
			max = Math.max(cnt, max);
		}
		System.out.println(max);
	}
}