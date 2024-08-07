import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), input, max = 0;
		double sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			input = Integer.parseInt(st.nextToken());
			max = Math.max(input, max);
			sum += input;
		}
		sum -= max;
		System.out.println(max + (sum / 2.0));
	}
}