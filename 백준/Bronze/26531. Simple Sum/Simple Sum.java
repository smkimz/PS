import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x, y;
		x = st.nextToken().charAt(0) - '0';
		st.nextToken();
		y = st.nextToken().charAt(0) - '0';
		st.nextToken();
		System.out.println(x + y == st.nextToken().charAt(0) - '0' ? "YES" : "NO");
	}
}