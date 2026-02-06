import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), t;
		while (--T >= 0) {
			t = Integer.parseInt(br.readLine());
			if (t % 25 < 17)
				sb.append("ONLINE\n");
			else
				sb.append("OFFLINE\n");
		}
		System.out.print(sb);
	}
}