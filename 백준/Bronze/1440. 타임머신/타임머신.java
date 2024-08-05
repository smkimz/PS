import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int[] time = new int[3];
		int cnt = 0;
		for (int i = 0; i <= 2; i++) {
			time[i] = Integer.parseInt(st.nextToken());
			if (time[i] >= 60) {
				System.out.println(0);
				return;
			}
			if (time[i] >= 13 || time[i] == 0)
				++cnt;
		}
		System.out.println(6 - 2 * cnt);
	}
}