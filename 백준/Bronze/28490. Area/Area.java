import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), size, max = 0;
		StringTokenizer st;
		while (--n >= 0) {
			st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			max = Math.max(max, size);
		}
		System.out.print(max);
	}
}