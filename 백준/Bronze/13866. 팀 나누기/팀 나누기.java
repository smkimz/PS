import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int diff = 0, x;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			x = Integer.parseInt(st.nextToken());
			diff += i % 3 == 0 ? x : -x;
		}
		System.out.println(Math.abs(diff));
	}
}
