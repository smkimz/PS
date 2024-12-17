import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = N * 3;
		String a = "", b = "";
		for (int i = 0; i < N; i++) {
			a += "@@@@@";
			b += "@";
		}
		for (int i = 0; i < N; i++)
			sb.append(a).append("\n");
		for (int i = 0; i < M; i++)
			sb.append(b).append("\n");
		for (int i = 0; i < N; i++)
			sb.append(a).append("\n");
		System.out.print(sb);
	}
}