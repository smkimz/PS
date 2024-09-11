import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i >= 3; i--) {
			sb.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n")
					.append("Take one down and pass it around, ").append(i - 1)
					.append(" bottles of beer on the wall.\n\n");
		}
		if (N >= 2)
			sb.append(
					"2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n\n");
		sb.append(
				"1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n\n")
				.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, ")
				.append(N);
		if (N == 1)
			sb.append(" bottle of beer on the wall.");
		else
			sb.append(" bottles of beer on the wall.");
		System.out.println(sb);
	}
}