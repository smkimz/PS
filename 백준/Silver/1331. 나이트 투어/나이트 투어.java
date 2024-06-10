import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nR, nC, pR, pC;
		boolean[][] visited = new boolean[6][6];
		char[] order = br.readLine().toCharArray();
		int[] start = new int[2];
		pC = order[0] - 'A';
		pR = '6' - order[1];
		start[0] = pR;
		start[1] = pC;
		visited[pR][pC] = true;
		for (int i = 1; i < 36; i++) {
			order = br.readLine().toCharArray();
			nC = order[0] - 'A';
			nR = '6' - order[1];
			if (visited[nR][nC]) {
				System.out.println("Invalid");
				return;
			}
			if (!isMovable(nR, nC, pR, pC))
				return;
			visited[nR][nC] = true;
			pC = nC;
			pR = nR;
		}
		if (!isMovable(start[0], start[1], pR, pC))
			return;
		System.out.println("Valid");
	}

	static boolean isMovable(int nR, int nC, int pR, int pC) {
		int dC = Math.abs(nC - pC), dR = Math.abs(nR - pR);
		if (!((dC == 1 && dR == 2) || (dC == 2 && dR == 1))) {
			System.out.println("Invalid");
			return false;
		}
		return true;
	}
}
