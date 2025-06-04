import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y;
		int[] arr = new int[5];
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if (x > 0) {
				if (y > 0)
					++arr[1];
				else if (y < 0)
					++arr[4];
				else
					++arr[0];
			} else if (x < 0) {
				if (y > 0)
					++arr[2];
				else if (y < 0)
					++arr[3];
				else
					++arr[0];
			} else
				++arr[0];
		}
		for (int i = 1; i <= 4; i++)
			sb.append('Q').append(i).append(": ").append(arr[i]).append("\n");
		sb.append("AXIS: ").append(arr[0]);
		System.out.println(sb);
	}
}