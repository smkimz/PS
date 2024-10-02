import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] N = br.readLine().toCharArray();
		int[] count = new int[128];
		int sum = 0;
		for (int i = 0; i < N.length; i++) {
			sum += N[i];
			++count[N[i]];
		}
		sum -= '0' * N.length;
		if (sum % 3 != 0 || count['0'] == 0) {
			System.out.println(-1);
			return;
		}
		for (int i = '9'; i >= '0'; i--) {
			for (int j = 0; j < count[i]; j++)
				sb.append((char) i);
		}
		System.out.print(sb);
	}
}