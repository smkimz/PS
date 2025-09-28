import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int Q = Integer.parseInt(br.readLine()), y, p = 0;
		char x;
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			x = st.nextToken().charAt(0);
			y = Integer.parseInt(st.nextToken());
			if (x == '1')
				p += y;
			else {
				p -= y;
				if (p < 0) {
					System.out.println("Adios");
					return;
				}
			}
		}
		System.out.println("See you next month");
	}
}