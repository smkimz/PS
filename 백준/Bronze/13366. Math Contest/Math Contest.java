import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] ctoi = new int[128];
		for (int i = '0'; i <= '9'; i++)
			ctoi[i] = i - '0';
		int T = Integer.parseInt(br.readLine()), sum;
		char[] x;
		while (--T >= 0) {
			x = br.readLine().toCharArray();
			sum = 0;
			for (int i = 0; i < x.length; i++)
				sum += ctoi[x[i]];
			sb.append(sum % 9 == 0 ? "YES\n" : "NO\n");
		}
		System.out.print(sb);
	}
}