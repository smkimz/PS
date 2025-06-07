import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), x, y, now = 0;
		while (--N >= 0) {
			x = Integer.parseInt(br.readLine());
			y = x - now;
			if (y == 1) {
				++now;
				continue;
			}
			for (int i = 1; i < y; i++)
				sb.append(now + i).append("\n");
			now += y;
		}
		if (sb.length() == 0)
			System.out.println("good job");
		else
			System.out.print(sb);
	}
}