import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x, sum = 0, max = 0;
		for (int i = 0; i < 3; i++) {
			x = Integer.parseInt(st.nextToken());
			sum += x;
			max = Math.max(max, x);
		}
		System.out.println(max * 3 - sum);
	}
}