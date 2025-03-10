import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		long ans = 0;
		for (int i = 0; i < str.length; i++)
			ans += (long) ((str[i] - 'A' + 1) * Math.pow(26, str.length - i - 1));
		System.out.println(ans);
	}
}