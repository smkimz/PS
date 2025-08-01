import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray();
		int len = N.length, X;
		long ans = 0;
		for (int i = 0; i < len; i++) {
			X = (int) Math.pow(10, i);
			for (int j = 0; j < len; j++)
				ans += X * (N[j] - '0');
		}
		System.out.println(ans);
	}
}