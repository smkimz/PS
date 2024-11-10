import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), val;
		long profit, maxProfit;
		while (N != 0) {
			profit = -10001;
			maxProfit = Long.MIN_VALUE;
			while (--N >= 0) {
				val = Integer.parseInt(br.readLine());
				profit = Math.max(profit + val, val);
				maxProfit = Math.max(maxProfit, profit);
			}
			sb.append(maxProfit).append("\n");
			N = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}