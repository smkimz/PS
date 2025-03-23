import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		double M = (B - A) / 400.0;
		System.out.println(String.format("%.6f", 1 / (1 + Math.pow(10, M))));
	}
}