import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, width = 0, plain = 0;
		int[] mountain = new int[N + 1];
		boolean isDecrease = false;
		for (int i = 0; i < N; i++)
			mountain[i] = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int diff = mountain[i + 1] - mountain[i];
			width++;
			if (diff > 0) {
				if (isDecrease) {
					ans = Math.max(ans, width);
					width = 1 + plain;
				}
				plain = 0;
				isDecrease = false;
			} else if (diff < 0) {
				plain = 0;
				isDecrease = true;
			} else
				plain++;
		}
		System.out.println(Math.max(ans, width));
	}
}
