import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double x, y;
		HashSet<Double> leftSlopes = new HashSet<>(), rightSlopes = new HashSet<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Double.parseDouble(st.nextToken());
			y = Double.parseDouble(st.nextToken());
			if (x > 0 || (x == 0 && y < 0))
				leftSlopes.add(x / y);
			else
				rightSlopes.add(x / y);

		}
		System.out.println(leftSlopes.size() + rightSlopes.size());
	}
}