import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), x, y, a = 0, b;
		HashMap<String, Integer> D = new HashMap<>();
		D.put("Mon", 0);
		D.put("Tue", 24);
		D.put("Wed", 48);
		D.put("Thu", 72);
		D.put("Fri", 96);
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = D.get(st.nextToken()) + Integer.parseInt(st.nextToken());
			y = D.get(st.nextToken()) + Integer.parseInt(st.nextToken());
			a += y - x;
		}
		b = T - a;
		if (b <= 0)
			System.out.println(0);
		else if (b > 48)
			System.out.println(-1);
		else
			System.out.println(b);
	}
}