import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] start = { Integer.parseInt(st.nextToken()) % 2, Integer.parseInt(st.nextToken()) % 2 };
		st = new StringTokenizer(br.readLine());
		int[] end = { Integer.parseInt(st.nextToken()) % 2, Integer.parseInt(st.nextToken()) % 2 };
		if (start[0] == end[0]) {
			if (start[1] == end[1])
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			if (start[1] != end[1])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}