import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = Math.min(42, N), level, sum = 0, ability = 0;
		int[] boundary = new int[] { 60, 100, 140, 200, 250 };
		ArrayList<Integer> characters = new ArrayList<>();
		while (--N >= 0)
			characters.add(Integer.parseInt(br.readLine()));
		Collections.sort(characters, Collections.reverseOrder());
		for (int i = 0; i < M; i++) {
			level = characters.get(i);
			sum += level;
			for (int j = 0; j < 5; j++) {
				if (level < boundary[j])
					break;
				++ability;
			}
		}
		System.out.printf("%d %d", sum, ability);
	}
}