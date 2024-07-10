import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		final int MIN = -1, MAX = 11;
		int num = Integer.parseInt(br.readLine()), l, r;
		boolean isLie;
		String ans;
		while (num != 0) {
			r = MAX;
			l = MIN;
			isLie = false;
			while (true) {
				ans = br.readLine();
				if (ans.equals("too high"))
					r = Math.min(r, num);
				else if (ans.equals("too low"))
					l = Math.max(l, num);
				else
					break;
				num = Integer.parseInt(br.readLine());
			}
			if ((r != MAX && r <= num) || (l != MIN && l >= num) || (r != MAX && l != MIN && r <= l))
				isLie = true;
			if (isLie)
				sb.append("Stan is dishonest").append("\n");
			else
				sb.append("Stan may be honest").append("\n");
			num = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}