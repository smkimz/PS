import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
		char[] S = br.readLine().toCharArray(), uospc = new char[] { 'u', 'o', 's', 'p', 'c' };
		int[] count = new int[128];
		for (int i = 0; i < N; i++)
			++count[S[i]];
		for (int i = 0; i < 5; i++)
			min = Math.min(min, count[uospc[i]]);
		System.out.println(min);
	}
}