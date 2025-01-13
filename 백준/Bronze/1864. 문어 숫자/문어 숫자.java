import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] X, signs = new char[] { '/', '-', '\\', '(', '@', '?', '>', '&', '%' };
		int[] E = new int[128];
		for (int i = -1; i <= 7; i++)
			E[signs[i + 1]] = i;
		int Y = 0;
		while (true) {
			X = br.readLine().toCharArray();
			if (X[0] == '#')
				break;
			Y = 0;
			for (int i = 0; i < X.length; i++)
				Y += E[X[i]] * Math.pow(8, X.length - i - 1);
			sb.append(Y).append("\n");
		}
		System.out.print(sb);
	}
}