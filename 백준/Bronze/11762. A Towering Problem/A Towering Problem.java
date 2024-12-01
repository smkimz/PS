import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] B = new int[6], T = new int[2];
		for (int i = 0; i <= 5; i++)
			B[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i <= 1; i++)
			T[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(B);
		for (int x = 0; x <= 3; x++) {
			for (int y = x + 1; y <= 4; y++) {
				for (int z = y + 1; z <= 5; z++) {
					if (B[x] + B[y] + B[z] != T[0])
						continue;
					sb.append(B[z]).append(" ").append(B[y]).append(" ").append(B[x]).append(" ");
					B[z] = -1;
					B[y] = -1;
					B[x] = -1;
					for (int i = 5; i >= 0; i--) {
						if (B[i] == -1)
							continue;
						sb.append(B[i]).append(" ");
					}
					System.out.print(sb);
					return;
				}
			}
		}
	}
}