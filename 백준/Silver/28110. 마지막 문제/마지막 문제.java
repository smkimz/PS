import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), level, diff, maxLevel = -1, maxDiff = 0;
		ArrayList<Integer> problems = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			problems.add(Integer.parseInt(st.nextToken()));
		Collections.sort(problems);
		for (int i = 1; i < N; i++) {
			level = (problems.get(i) + problems.get(i - 1)) / 2;
			diff = Math.min(level - problems.get(i - 1), problems.get(i) - level);
			if (diff <= maxDiff)
				continue;
			maxLevel = level;
			maxDiff = diff;
		}
		System.out.println(maxLevel);
	}
}