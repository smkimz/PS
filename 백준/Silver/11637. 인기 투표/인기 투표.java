import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, num, sum;
		int[] max = new int[3];
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			num = 0;
			for (int i = 0; i <= 2; i++)
				max[i] = 0;
			for (int i = 1; i <= N; i++) {
				num = Integer.parseInt(br.readLine());
				sum += num;
				if (num > max[0]) {
					max[0] = num;
					max[1] = i;
					max[2] = 1;
				} else if (num == max[0])
					++max[2];
			}
			if (max[2] != 1) {
				sb.append("no winner").append("\n");
				continue;
			}
			sum -= max[0];
			if (max[0] > sum)
				sb.append("majority winner ").append(max[1]).append("\n");
			else
				sb.append("minority winner ").append(max[1]).append("\n");
		}
		System.out.print(sb);
	}
}