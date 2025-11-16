import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, sum = 0, min = 101;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			x = Integer.parseInt(st.nextToken());
			sum += x;
			min = Math.min(min, x);
		}
		System.out.println(sum - min);
	}
}
