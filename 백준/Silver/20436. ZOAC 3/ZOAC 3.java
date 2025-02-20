import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[][] alphabets = new char[][] { { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' },
				{ 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' }, { 'z', 'x', 'c', 'v', 'b', 'n', 'm' } };
		HashMap<Character, Coordinate> keys = new HashMap<>();
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < (i == 2 ? 4 : 5); j++)
				keys.put(alphabets[i][j], new Coordinate(i, j, false));
			for (int j = (i == 2 ? 4 : 5); j < alphabets[i].length; j++)
				keys.put(alphabets[i][j], new Coordinate(i, j, true));
		}
		Coordinate left = keys.get(st.nextToken().charAt(0)), right = keys.get(st.nextToken().charAt(0)), dest;
		char[] str = br.readLine().toCharArray();
		int res = 0;
		for (int i = 0; i < str.length; i++) {
			dest = keys.get(str[i]);
			if (dest.flag) {
				res += Math.abs(right.row - dest.row) + Math.abs(right.col - dest.col) + 1;
				right = new Coordinate(dest.row, dest.col, dest.flag);
			} else {
				res += Math.abs(left.row - dest.row) + Math.abs(left.col - dest.col) + 1;
				left = new Coordinate(dest.row, dest.col, dest.flag);
			}
		}
		System.out.println(res);
	}

	static class Coordinate {
		int row, col;
		boolean flag;

		public Coordinate(int row, int col, boolean flag) {
			this.row = row;
			this.col = col;
			this.flag = flag;
		}
	}
}