import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), s = Integer.parseInt(br.readLine()),
				h = Integer.parseInt(br.readLine());
		String x = new String(), y = new String();
		for (int i = 0; i < s; i++)
			x += ' ';
		y += '*' + x + '*' + x + '*';
		for (int i = 0; i < t; i++)
			sb.append(y).append("\n");
		for (int i = 0; i < s * 2 + 3; i++)
			sb.append('*');
		sb.append("\n");
		x += " *";
		for (int i = 0; i < h; i++)
			sb.append(x).append("\n");
		System.out.print(sb);
	}
}
