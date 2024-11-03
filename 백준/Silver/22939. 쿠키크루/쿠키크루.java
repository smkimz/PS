import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), dist, min = Integer.MAX_VALUE, topping = -1;
		int[] toppingNumber = new int[128], home = new int[2], crew = new int[2];
		String[] occupations = { "Assassin", "Healer", "Mage", "Tanker" };
		ArrayList<Node>[] T = new ArrayList[4];
		for (int i = 0; i <= 3; i++)
			T[i] = new ArrayList<>();
		toppingNumber['J'] = 0;
		toppingNumber['C'] = 1;
		toppingNumber['B'] = 2;
		toppingNumber['W'] = 3;
		char[] input;
		for (int i = 0; i < N; i++) {
			input = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				if (input[j] == 'X')
					continue;
				else if (input[j] == 'H') {
					home[0] = i;
					home[1] = j;
				} else if (input[j] == '#') {
					crew[0] = i;
					crew[1] = j;
				} else
					T[toppingNumber[input[j]]].add(new Node(i, j));
			}
		}
		for (int c = 0; c <= 3; c++) {
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					if (j == i)
						continue;
					for (int k = 0; k <= 2; k++) {
						if (k == i || k == j)
							continue;
						dist = (Math.abs(home[0] - T[c].get(i).row) + Math.abs(home[1] - T[c].get(i).col))
								+ (Math.abs(T[c].get(j).row - T[c].get(i).row)
										+ Math.abs(T[c].get(j).col - T[c].get(i).col))
								+ (Math.abs(T[c].get(k).row - T[c].get(j).row)
										+ Math.abs(T[c].get(k).col - T[c].get(j).col))
								+ (Math.abs(crew[0] - T[c].get(k).row) + Math.abs(crew[1] - T[c].get(k).col));
						if (dist >= min)
							break;
						min = dist;
						topping = c;
					}
				}
			}
		}
		System.out.println(occupations[topping]);
	}

	static class Node {
		int row, col;

		public Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
}