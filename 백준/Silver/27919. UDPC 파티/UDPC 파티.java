import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] V = br.readLine().toCharArray();
		int U = 0, DP = 0;
		for (int i = 0; i < V.length; i++) {
			if (V[i] == 'U' || V[i] == 'C')
				++U;
			else
				++DP;
		}
		if (2 * U - 2 >= DP)
			sb.append("U");
		if (DP >= 1)
			sb.append("DP");
		System.out.println(sb);
	}
}