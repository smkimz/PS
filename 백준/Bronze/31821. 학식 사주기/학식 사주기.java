import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M, ans = 0;
		int[] menu = new int[N + 1];
		for (int i = 1; i <= N; i++)
			menu[i] = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		while (--M >= 0)
			ans += menu[Integer.parseInt(br.readLine())];
		System.out.println(ans);
	}
}