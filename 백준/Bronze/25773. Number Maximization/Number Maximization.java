import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] num = br.readLine().toCharArray();
		int[] cnt = new int[10];
		for (int i = 0; i < num.length; i++)
			cnt[num[i] - '0']++;
		for (int i = 9; i >= 0; i--) {
			for (int j = 1; j <= cnt[i]; j++)
				sb.append(i);
		}
		System.out.println(sb);
	}
}