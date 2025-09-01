import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken()), M = Long.parseLong(st.nextToken()), sum = 0, i = N;
		st = new StringTokenizer(br.readLine());
		while (--i >= 0)
			sum += Long.parseLong(st.nextToken()) - 1;
		System.out.println(sum < M ? "OUT" : "DIMI");
	}
}