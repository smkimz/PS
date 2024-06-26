import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] res = new int[2];
		for (int i = 0; i <= 1; i++) {
			res[i] = 1;
			for (int j = 0; j <= i + 1; j++)
				res[i] *= Integer.parseInt(st.nextToken());
		}
		System.out.println(res[0] - res[1]);
	}
}
