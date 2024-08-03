import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] days = { { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
	static int[] today = new int[3];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= 2; i++)
			today[i] = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		int[] D = new int[3];
		boolean isValid;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			isValid = false;
			for (int i = 0; i <= 2; i++)
				D[i] = Integer.parseInt(st.nextToken());
			if (checkValidDate(D[0], D[1], D[2])) {
				isValid = true;
				if (!checkExpiration(D[0], D[1], D[2])) {
					sb.append("unsafe").append("\n");
					continue;
				}
			}
			if (checkValidDate(D[2], D[1], D[0])) {
				isValid = true;
				if (!checkExpiration(D[2], D[1], D[0])) {
					sb.append("unsafe").append("\n");
					continue;
				}
			}
			if (checkValidDate(D[2], D[0], D[1])) {
				isValid = true;
				if (!checkExpiration(D[2], D[0], D[1])) {
					sb.append("unsafe").append("\n");
					continue;
				}
			}
			if (isValid)
				sb.append("safe");
			else
				sb.append("invalid");
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static boolean checkValidDate(int year, int month, int day) {
		if (month == 0 || month > 12)
			return false;
		if (day == 0 || day > days[year % 4 == 0 ? 1 : 0][month])
			return false;
		return true;
	}

	static boolean checkExpiration(int year, int month, int day) {
		if (year < today[0])
			return false;
		if (year == today[0]) {
			if (month < today[1])
				return false;
			if (month == today[1] && day < today[2])
				return false;
		}
		return true;
	}
}