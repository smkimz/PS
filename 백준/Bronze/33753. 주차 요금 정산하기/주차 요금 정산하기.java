import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()),
				C = Integer.parseInt(st.nextToken()), T = Integer.parseInt(br.readLine());
		if (T <= 30) {
			System.out.println(A);
			return;
		}
		T -= 30;
		T = (int) Math.ceil(T / (B * 1.0));
		System.out.println(A + T * C);
	}
}