import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer x, y;
		String sound;
		HashSet<String> sounds;
		int T = Integer.parseInt(br.readLine());
		while (--T >= 0) {
			x = new StringTokenizer(br.readLine());
			sounds = new HashSet<>();
			while (true) {
				y = new StringTokenizer(br.readLine());
				if (y.countTokens() == 5)
					break;
				y.nextToken();
				y.nextToken();
				sounds.add(y.nextToken());
			}
			while (x.hasMoreTokens()) {
				sound = x.nextToken();
				if (!sounds.contains(sound))
					sb.append(sound).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}