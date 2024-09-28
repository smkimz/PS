import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A = 0, B = 100, sum = 0;
		StringTokenizer inputA = new StringTokenizer(br.readLine()), inputB = new StringTokenizer(br.readLine());
		int[] numCounterA = new int[101], numCounterB = new int[101];
		for (int i = 0; i < N; i++) {
			++numCounterA[Integer.parseInt(inputA.nextToken())];
			++numCounterB[Integer.parseInt(inputB.nextToken())];
		}

		while (--N >= 0) {
			while (A <= 99 && numCounterA[A] == 0)
				++A;
			while (B >= 1 && numCounterB[B] == 0)
				--B;
			sum += A * B;
			--numCounterA[A];
			--numCounterB[B];
		}

		System.out.println(sum);
	}
}