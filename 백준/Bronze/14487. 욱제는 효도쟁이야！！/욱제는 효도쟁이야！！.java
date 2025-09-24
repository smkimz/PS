import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v, max = 0, sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			v = Integer.parseInt(st.nextToken());
			sum += v;
			max = Math.max(max, v);
		}
		System.out.println(sum - max);
	}
}