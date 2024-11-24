import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), odd = 0, even = 0, a;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			a = Integer.parseInt(st.nextToken());
			if (a % 2 == 1)
				++odd;
			else
				++even;
		}
		if (odd == even || odd - even == 1)
			System.out.println(1);
		else
			System.out.println(0);
	}
}