import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()),
				C = Integer.parseInt(br.readLine()), X = A * B * C;
		int[] count = new int[10];
		while (X != 0) {
			++count[(int) (X % 10)];
			X /= 10;
		}
		for (int i = 0; i <= 9; i++)
			sb.append(count[i]).append("\n");
		System.out.print(sb);
	}
}