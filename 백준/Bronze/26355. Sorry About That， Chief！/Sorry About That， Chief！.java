import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), V, left, right, diff;
		boolean[] isNotPrime = new boolean[10008];
		for (int i = 2; i <= 10007; i++) {
			if (isNotPrime[i])
				continue;
			for (int j = i * i; j <= 10007; j += i)
				isNotPrime[j] = true;
		}
		while (--N >= 0) {
			V = Integer.parseInt(br.readLine());
			sb.append("Input value: ").append(V).append("\n");
			left = V;
			right = V;
			while (left >= 2 && isNotPrime[left])
				--left;
			while (right <= 10007 && isNotPrime[right])
				++right;
			diff = Math.min(V - left, right - V);
			if (diff == 0)
				sb.append("Would you believe it; it is a prime!");
			else
				sb.append("Missed it by that much (").append(diff).append(")!");
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}