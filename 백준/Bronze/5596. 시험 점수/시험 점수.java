import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = 0, T = 0;
		StringTokenizer[] st = new StringTokenizer[2];
		st[0] = new StringTokenizer(br.readLine());
		st[1] = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			S += Integer.parseInt(st[0].nextToken());
			T += Integer.parseInt(st[1].nextToken());
		}
		System.out.println(Math.max(S, T));
	}
}