import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] input = new int[4];
		int x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++)
				input[i] = Integer.parseInt(st.nextToken());
			if (input[0] + input[1] + input[2] + input[3] == 0)
				break;
			x = input[0] * 60 + input[1];
			y = input[2] * 60 + input[3];
			if (x > y)
				x -= 1440;
			sb.append(y - x).append("\n");
		}
		System.out.print(sb);
	}
}