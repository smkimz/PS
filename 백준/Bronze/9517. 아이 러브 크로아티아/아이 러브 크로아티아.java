import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()) - 1, N = Integer.parseInt(br.readLine()), T = 0;
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			T += Integer.parseInt(st.nextToken());
			if (T >= 210)
				break;
			if (st.nextToken().charAt(0) == 'T')
				++K;
		}
		System.out.println(K % 8 + 1);
	}
}