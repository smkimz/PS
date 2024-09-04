import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		long Q = Integer.parseInt(br.readLine()), a, d, x, row, col;
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			row = searchXRow(a, d, x);
			col = searchXCol(a, d, x, row);
			sb.append(row).append(" ").append(col).append("\n");
		}
		System.out.print(sb);
	}

	static long searchXRow(long a, long d, long x) {
		return (long) ((3 * d - 2 * a + Math.sqrt(Math.pow(2 * a - 3 * d, 2) - 8 * d * (1 - a + d - x))) / (2 * d));
	}

	static long searchXCol(long a, long d, long x, long n) {
		long first = (d * n * n + (2 * a - 3 * d) * n + 2 * (1 - a + d)) / 2;
		return x - first + 1;
	}
}