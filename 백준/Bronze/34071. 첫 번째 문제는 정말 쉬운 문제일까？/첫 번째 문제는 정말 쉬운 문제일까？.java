import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), first = Integer.parseInt(br.readLine()), score;
		boolean isHardest = true, isEasiest = true;
		while (--N > 0) {
			score = Integer.parseInt(br.readLine());
			if (score > first)
				isHardest = false;
			if (score < first)
				isEasiest = false;
		}
		if (isHardest)
			System.out.println("hard");
		else if (isEasiest)
			System.out.println("ez");
		else
			System.out.println('?');
	}
}