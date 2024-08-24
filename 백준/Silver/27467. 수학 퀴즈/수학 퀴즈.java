import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A;
		double P = 0, Q = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			A = Integer.parseInt(st.nextToken()) % 3;
			if (A == 1)
				++P;
			else if (A == 2) {
				--P;
				--Q;
			} else
				++Q;
		}
		System.out.printf("%.10f %.10f", P, Q);
	}
}