import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder x = new StringBuilder(), y;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			y = new StringBuilder();
			y.append(br.readLine()).reverse();
			x.append(y).append("\n");
		}
		System.out.print(x);
	}
}