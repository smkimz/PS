import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<Integer, Integer> board = new HashMap<>();
		boolean[] boardStatus = new boolean[25];
		boolean[][] bingoStatus = new boolean[3][];
		bingoStatus[0] = new boolean[5];
		bingoStatus[1] = new boolean[5];
		bingoStatus[2] = new boolean[2];
		for (int r = 0; r < 5; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < 5; c++)
				board.put(Integer.parseInt(st.nextToken()), r * 5 + c);
		}
		int bingo = 0;
		for (int r = 0; r < 5; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < 5; c++) {
				boardStatus[board.get(Integer.parseInt(st.nextToken()))] = true;
				p: for (int i = 0; i < 5; i++) {
					if (!boardStatus[i * 5] || bingoStatus[0][i])
						continue;
					for (int j = 1; j < 5; j++) {
						if (!boardStatus[i * 5 + j])
							continue p;
					}
					bingoStatus[0][i] = true;
					++bingo;
				}
				p: for (int i = 0; i < 5; i++) {
					if (!boardStatus[i] || bingoStatus[1][i])
						continue;
					for (int j = 1; j < 5; j++) {
						if (!boardStatus[i + j * 5])
							continue p;
					}
					bingoStatus[1][i] = true;
					++bingo;
				}
				p: for (int i = 0; i < 2; i++) {
					if (!boardStatus[i * 4] || bingoStatus[2][i])
						continue;
					for (int j = 1; j < 5; j++) {
						if (i == 0) {
							if (!boardStatus[j * 6])
								continue p;
						} else {
							if (!boardStatus[4 + j * 4])
								continue p;
						}
					}
					bingoStatus[2][i] = true;
					++bingo;
				}
				if (bingo >= 3) {
					System.out.println(r * 5 + c + 1);
					return;
				}
			}
		}
	}
}