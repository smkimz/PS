import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] numbers;
	static char[] signs;
	static boolean[] checkNumber;
	static boolean complete = false;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		numbers = new int[N + 1];
		signs = new char[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			signs[i] = st.nextToken().charAt(0);
		for (int i = 9; i >= 0; i--) {
			checkNumber = new boolean[10];
			if (complete)
				break;
			backTracking(i, 0);
		}
		complete = false;
		for (int i = 0; i <= N; i++)
			sb.append(numbers[i]);
		sb.append("\n");
		for (int i = 0; i <= 9; i++) {
			checkNumber = new boolean[10];
			if (complete)
				break;
			backTracking(i, 0);
		}
		for (int i = 0; i <= N; i++)
			sb.append(numbers[i]);
		sb.append("\n");
		System.out.print(sb);
	}

	static void backTracking(int num, int idx) {
		if (complete)
			return;
		numbers[idx] = num;
		checkNumber[num] = true;
		if (idx == N) {
			complete = true;
			return;
		}
		if (signs[idx] == '>') {
			for (int i = num - 1; i >= 0; i--) {
				if (!checkNumber[i])
					backTracking(i, idx + 1);
			}
		} else {
			for (int i = num + 1; i <= 9; i++) {
				if (!checkNumber[i])
					backTracking(i, idx + 1);
			}
		}
		checkNumber[num] = false;
	}
}