import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] SciComLove = new char[] { 'S', 'c', 'i', 'C', 'o', 'm', 'L', 'o', 'v', 'e' },
				S = br.readLine().toCharArray();
		int ans = 0;
		for (int i = 0; i < 10; i++)
			ans += S[i] != SciComLove[i] ? 1 : 0;
		System.out.println(ans);
	}
}