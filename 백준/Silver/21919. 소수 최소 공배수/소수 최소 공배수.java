import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] isNotPrime = new boolean[1001];
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= 1000; i++) {
			if (isNotPrime[i])
				continue;
			for (int j = i * 2; j <= 1000; j += i)
				isNotPrime[j] = true;
		}
		for (int i = 2; i <= 1000; i++) {
			if (!isNotPrime[i])
				primes.add(i);
		}
		HashSet<Integer> set = new HashSet<>();
		int N = Integer.parseInt(br.readLine()), A, B;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long ans = 1;
		boolean flag;
		while (--N >= 0) {
			A = Integer.parseInt(st.nextToken());
			if (set.contains(A))
				continue;
			B = (int) Math.sqrt(A);
			flag = false;
			for (int x : primes) {
				if (x > B)
					break;
				if (A % x != 0)
					continue;
				flag = true;
			}
			if (flag)
				continue;
			else
				set.add(A);
			ans *= A;
		}
		System.out.println(ans == 1 ? -1 : ans);
	}
}