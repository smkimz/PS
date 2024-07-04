import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		StringTokenizer[] arr = new StringTokenizer[2];
		for (int i = 0; i <= 1; i++)
			arr[i] = new StringTokenizer(br.readLine());
		int[] num = new int[2];
		num[0] = Integer.parseInt(arr[0].nextToken());
		num[1] = Integer.parseInt(arr[1].nextToken());
		while (true) {
			if (num[0] <= num[1]) {
				sb.append(num[0]).append(" ");
				if (arr[0].hasMoreTokens())
					num[0] = Integer.parseInt(arr[0].nextToken());
				else {
					sb.append(num[1]).append(" ");
					break;
				}
			} else {
				sb.append(num[1]).append(" ");
				if (arr[1].hasMoreTokens())
					num[1] = Integer.parseInt(arr[1].nextToken());
				else {
					sb.append(num[0]).append(" ");
					break;
				}
			}
		}
		while (arr[0].hasMoreTokens())
			sb.append(Integer.parseInt(arr[0].nextToken())).append(" ");
		while (arr[1].hasMoreTokens())
			sb.append(Integer.parseInt(arr[1].nextToken())).append(" ");
		System.out.print(sb);
	}
}