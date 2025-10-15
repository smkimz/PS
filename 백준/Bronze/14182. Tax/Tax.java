import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x;
		int[] b = new int[] { 1000000, 5000000, 10000000 };
		double[] r = new double[] { 1, 0.9, 0.8 };
		while (true) {
			x = Integer.parseInt(br.readLine());
			if (x == 0)
				break;
			for (int i = 0; i < b.length; i++) {
				if (x <= b[i]) {
					sb.append((int) (x * r[i])).append("\n");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
