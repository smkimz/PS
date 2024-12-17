import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] words = new String[][] { { "social", "history", "language", "literacy" },
				{ "bigdata", "public", "society" } };
		String[] tracks = new String[] { "digital humanities", "public bigdata" };
		String title = br.readLine();
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < words[i].length; j++) {
				if (title.contains(words[i][j])) {
					System.out.println(tracks[i]);
					return;
				}
			}
		}
	}
}