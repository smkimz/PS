import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[4], B = new int[3];
		int x, y, ret;
		for (int i = 0; i < 4; i++)
			A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++)
			B[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < 3; i++) {
			ret = 0;
			x = A[0] + A[1];
			y = B[i];
			if (y % x <= A[0] && y % x != 0)
				++ret;
			x = A[2] + A[3];
			if (y % x <= A[2] && y % x != 0)
				++ret;
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}