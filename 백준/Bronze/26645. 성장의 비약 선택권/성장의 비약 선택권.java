import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans;
		if (N <= 205)
			ans = 1;
		else if (N <= 217)
			ans = 2;
		else if (N <= 228)
			ans = 3;
		else
			ans = 4;
		System.out.println(ans);
	}
}