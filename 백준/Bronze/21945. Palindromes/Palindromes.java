import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), len;
		long sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num;
		p: while (--N >= 0) {
			num = st.nextToken();
			len = num.length();
			for (int i = 0; i < len / 2; i++) {
				if (num.charAt(i) != num.charAt(len - i - 1))
					continue p;
			}
			sum += Integer.parseInt(num);
		}
		System.out.println(sum);
	}
}