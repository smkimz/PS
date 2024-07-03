import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int[][] limitArr = new int[N][2], speedArr = new int[M][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			limitArr[i][0] = Integer.parseInt(st.nextToken());
			limitArr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			speedArr[i][0] = Integer.parseInt(st.nextToken());
			speedArr[i][1] = Integer.parseInt(st.nextToken());
		}
		int idxL = 0, idxS = 0, distL = 0, distS = 0, ans = 0;
		for (int i = 0; i <= 100; i++) {
			if (limitArr[idxL][0] < i - distL) {
				distL += limitArr[idxL][0];
				idxL++;
			}
			if (speedArr[idxS][0] < i - distS) {
				distS += speedArr[idxS][0];
				idxS++;
			}
			ans = Math.max(ans, speedArr[idxS][1] - limitArr[idxL][1]);
		}
		System.out.println(ans);
	}
}