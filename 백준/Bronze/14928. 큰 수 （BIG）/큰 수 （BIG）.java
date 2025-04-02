import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray();
		long ans = 0;
		for (int i = 0; i < N.length; i++)
			ans = (ans * 10 + N[i] - '0') % 20000303;
		System.out.println(ans);
	}
}