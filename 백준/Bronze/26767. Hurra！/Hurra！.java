import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean x, y;
		for (int i = 1; i <= N; i++) {
			if (i % 7 == 0)
				x = true;
			else
				x = false;
			if (i % 11 == 0)
				y = true;
			else
				y = false;
			if (x && y)
				sb.append("Wiwat!\n");
			else if (x)
				sb.append("Hurra!\n");
			else if (y)
				sb.append("Super!\n");
			else
				sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
}
