import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] fac = { 1, 2, 6, 24, 120 };
		int ret, len;
		char[] N = br.readLine().toCharArray();
		while (N.length != 1 || N[0] != '0') {
			ret = 0;
			len = N.length - 1;
			for (int i = 0; i <= len; i++)
				ret += fac[i] * (N[len - i] - '0');
			sb.append(ret).append("\n");
			N = br.readLine().toCharArray();
		}
		System.out.println(sb);
	}
}