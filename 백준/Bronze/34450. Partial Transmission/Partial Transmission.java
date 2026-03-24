import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), p = Integer.parseInt(br.readLine()), s = n * (2 * p + n - 1) / 2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			s -= Integer.parseInt(st.nextToken());
		System.out.println(s);
	}
}