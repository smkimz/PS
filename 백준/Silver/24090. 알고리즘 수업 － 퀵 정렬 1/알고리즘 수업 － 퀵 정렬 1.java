import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int K, count = 0;
	static int[] A;
	static boolean checker = false;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		quickSort(0, N - 1);
		if (!checker)
			System.out.println(-1);
	}

	static void quickSort(int p, int r) {
		if (checker || p >= r)
			return;
		int q = partition(p, r);
		quickSort(p, q - 1);
		quickSort(q + 1, r);
	}

	static int partition(int p, int r) {
		int x = A[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (A[j] > x)
				continue;
			++i;
			swap(i, j);
		}
		if (i + 1 != r)
			swap(i + 1, r);
		return i + 1;
	}

	static void swap(int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
		++count;
		if (count == K) {
			System.out.printf("%d %d", A[x], A[y]);
			checker = true;
		}
	}
}