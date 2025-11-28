import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a, b;
		int[] P = new int[] { 100, 1000, 10000, 100000 };
		HashSet<Integer> rdnums;
		while (true) {
			a = Integer.parseInt(br.readLine());
			if (a == 0)
				break;
			rdnums = new HashSet<Integer>();
			while (!rdnums.contains(a)) {
				rdnums.add(a);
				a = (int) Math.pow(a, 2);
				b = 0;
				for (int i = 3; i >= 0; i--) {
					a %= P[i] * 10;
					b += a / P[i] * Math.pow(10, i);
				}
				a = b;
			}
			sb.append(rdnums.size()).append("\n");
		}
		System.out.print(sb);
	}
}
