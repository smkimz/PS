import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] X = br.readLine().toCharArray(), Y;
		boolean[] Z = new boolean['9' + 1];
		for (int i = 0; i < X.length; i++)
			Z[X[i]] = true;
		int N = Integer.parseInt(br.readLine()), A, B;
		while (--N >= 0) {
			A = 0;
			B = 0;
			Y = br.readLine().toCharArray();
			for (int i = 0; i < 4; i++) {
				A += Z[Y[i]] ? 1 : 0;
				B += X[i] == Y[i] ? 1 : 0;
			}
			sb.append(A).append(' ').append(B).append("\n");
		}
		System.out.print(sb);
	}
}