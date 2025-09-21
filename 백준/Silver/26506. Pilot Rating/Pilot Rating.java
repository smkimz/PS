import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = N - 1, min = Integer.MAX_VALUE;
		int[] pilot = new int[N];
		for (int i = 0; i < N; i++)
			pilot[i] = Integer.parseInt(br.readLine());
		Arrays.sort(pilot);
		for (int i = 0; i < N / 2; i++)
			min = Math.min(min, pilot[i] + pilot[M - i]);
		System.out.println(min);
	}
}