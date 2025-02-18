import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[][] arr;
		int n, x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			arr = new int[2][4];
			for (int i = 0; i < 4; i++)
				arr[0][i] = Integer.parseInt(st.nextToken());
			if (arr[0][0] == 0)
				break;
			n = 0;
			while (true) {
				x = n % 2;
				if (arr[x][0] == arr[x][1] && arr[x][1] == arr[x][2] && arr[x][2] == arr[x][3])
					break;
				y = (x + 1) % 2;
				arr[y][0] = Math.abs(arr[x][0] - arr[x][1]);
				arr[y][1] = Math.abs(arr[x][1] - arr[x][2]);
				arr[y][2] = Math.abs(arr[x][2] - arr[x][3]);
				arr[y][3] = Math.abs(arr[x][3] - arr[x][0]);
				++n;
			}
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}