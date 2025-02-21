import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, F;
	static int[] nums;
	static boolean[] checkNums;
	static boolean findAnswer = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		F = Integer.parseInt(st.nextToken());
		nums = new int[N];
		checkNums = new boolean[N + 1];
		searchNumbers(0);
	}

	static void searchNumbers(int idx) {
		if (findAnswer)
			return;
		if (idx == N) {
			if (calculateNumbers() != F)
				return;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++)
				sb.append(nums[i]).append(" ");
			System.out.print(sb);
			findAnswer = true;
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (checkNums[i])
				continue;
			nums[idx] = i;
			checkNums[i] = true;
			searchNumbers(idx + 1);
			checkNums[i] = false;
		}
	}

	static int calculateNumbers() {
		int[][] res = new int[2][N];
		int n = N, x = 0, y = 1;
		for (int i = 0; i < N; i++)
			res[0][i] = nums[i];
		while (n > 1) {
			for (int i = 0; i < n - 1; i++)
				res[y][i] = res[x][i] + res[x][i + 1];
			x = y;
			y = (y + 1) % 2;
			--n;
		}
		return res[(N + 1) % 2][0];
	}
}