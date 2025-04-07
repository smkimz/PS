import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), dist;
		char[] A, B;
		while (--T >= 0) {
			A = br.readLine().toCharArray();
			B = br.readLine().toCharArray();
			dist = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] != B[i])
					++dist;
			}
			sb.append("Hamming distance is ").append(dist).append(".\n");
		}
		System.out.print(sb);
	}
}