import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), ring;
		int N = Integer.parseInt(br.readLine()), ans = 0;
		while (--N >= 0) {
			ring = br.readLine();
			ring = ring.concat(ring);
			if (ring.contains(str))
				++ans;
		}
		System.out.println(ans);
	}
}