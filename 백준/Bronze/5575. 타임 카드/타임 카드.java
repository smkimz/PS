import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int x, y, z;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x = 0;
			y = 0;
			for (int j = 0; j < 3; j++)
				x += Math.pow(60, 2 - j) * Integer.parseInt(st.nextToken());
			for (int j = 0; j < 3; j++)
				y += Math.pow(60, 2 - j) * Integer.parseInt(st.nextToken());
			z = y - x;
			for (int j = 0; j < 3; j++) {
				sb.append(z / (int) Math.pow(60, 2 - j)).append(" ");
				z %= (int) Math.pow(60, 2 - j);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}