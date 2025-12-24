import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int N = Integer.parseInt(br.readLine()), X = 0, Y, ans = 0;
		int[] mult = new int[] { 10000, 100, 1 };
		for (int i = 0; i < 3; i++)
			X += Integer.parseInt(st.nextToken()) * mult[i];
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine(), "-");
			Y = 0;
			for (int i = 0; i < 3; i++)
				Y += Integer.parseInt(st.nextToken()) * mult[i];
			if (Y >= X)
				++ans;
		}
		System.out.println(ans);
	}
}
