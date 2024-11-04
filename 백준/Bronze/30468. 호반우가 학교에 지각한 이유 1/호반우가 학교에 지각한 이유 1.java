import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int status = 0, N;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= 3; i++)
			status += Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken()) * 4;
		System.out.println(N <= status ? 0 : N - status);
	}
}