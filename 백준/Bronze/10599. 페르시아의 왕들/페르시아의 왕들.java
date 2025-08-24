import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int min, max;
		int[] input = new int[4];
		boolean s;
		while (true) {
			st = new StringTokenizer(br.readLine());
			s = false;
			for (int i = 0; i < 4; i++) {
				input[i] = Integer.parseInt(st.nextToken());
				if (input[i] != 0)
					s = true;
			}
			if (!s)
				break;
			max = Math.max(input[2], input[3]);
			max -= Math.min(input[0], input[1]);
			min = Math.min(input[2], input[3]);
			min -= Math.max(input[0], input[1]);
			sb.append(min).append(' ').append(max).append("\n");
		}
		System.out.print(sb);
	}
}