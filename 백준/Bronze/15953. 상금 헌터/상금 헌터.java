import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), idx;
		int[] aPrize = new int[101], bPrize = new int[65], money;
		money = new int[] { 5000000, 3000000, 2000000, 500000, 300000, 100000 };
		idx = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++)
				aPrize[idx++] = money[i];
		}
		money = new int[] { 5120000, 2560000, 1280000, 640000, 320000 };
		idx = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < Math.pow(2, i); j++)
				bPrize[idx++] = money[i];
		}
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(aPrize[Integer.parseInt(st.nextToken())] + bPrize[Integer.parseInt(st.nextToken())]).append("\n");
		}
		System.out.print(sb);
	}
}