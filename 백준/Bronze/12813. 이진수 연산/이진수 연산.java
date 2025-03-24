import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] A = br.readLine().toCharArray(), B = br.readLine().toCharArray();
		char[][] ret = new char[5][A.length];
		for (int i = 0; i < A.length; i++) {
			ret[0][i] = A[i] == '1' && B[i] == '1' ? '1' : '0';
			ret[1][i] = A[i] == '1' || B[i] == '1' ? '1' : '0';
			ret[2][i] = ret[0][i] == '0' && ret[1][i] == '1' ? '1' : '0';
			ret[3][i] = A[i] == '1' ? '0' : '1';
			ret[4][i] = B[i] == '1' ? '0' : '1';
		}
		for (int i = 0; i <= 4; i++)
			sb.append(ret[i]).append("\n");
		System.out.print(sb);
	}
}