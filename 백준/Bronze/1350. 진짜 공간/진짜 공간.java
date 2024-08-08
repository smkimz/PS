import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long C = Integer.parseInt(br.readLine()), ans = 0;
		while (--N >= 0)
			ans += Math.ceil(Integer.parseInt(st.nextToken()) * 1.0 / C);
		System.out.println(ans * C);
	}
}