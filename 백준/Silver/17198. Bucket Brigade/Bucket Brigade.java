import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bRow = 0, bCol = 0, rRow = 0, rCol = 0, lRow = 0, lCol = 0, cow;
		char[] input;
		for (int i = 0; i < 10; i++) {
			input = br.readLine().toCharArray();
			for (int j = 0; j < 10; j++) {
				if (input[j] == '.')
					continue;
				else if (input[j] == 'B') {
					bRow = i;
					bCol = j;
				} else if (input[j] == 'L') {
					lRow = i;
					lCol = j;
				} else if (input[j] == 'R') {
					rRow = i;
					rCol = j;
				}
			}
		}
		cow = Math.abs(bRow - lRow) + Math.abs(bCol - lCol) - 1;
		if (bRow == rRow && lRow == rRow && ((bCol > rCol && rCol > lCol) || (bCol < rCol && rCol < lCol)))
			cow += 2;
		else if (bCol == rCol && lCol == rCol && ((bRow > rRow && rRow > lRow) || (bRow < rRow && rRow < lRow)))
			cow += 2;
		System.out.println(cow);
	}
}