import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double X, Z = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()) * 1000;
		int N = Integer.parseInt(br.readLine());
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			X = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()) * 1000;
			Z = Math.min(Z, X);
		}
		System.out.println(Z);
	}
}