import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), score, max = 0, min = 1000;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			score = Integer.parseInt(st.nextToken());
			if (score > max)
				max = score;
			if (score < min)
				min = score;
		}
		System.out.println(max - min);
	}
}