import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] X = br.readLine().toCharArray(), Y = br.readLine().toCharArray();
		int[] count = new int[128];
		int ans = 0;
		for (int i = 0; i < X.length; i++)
			++count[X[i]];
		for (int i = 0; i < Y.length; i++)
			--count[Y[i]];
		for (int i = 'a'; i <= 'z'; i++)
			ans += Math.abs(count[i]);
		System.out.println(ans);
	}
}