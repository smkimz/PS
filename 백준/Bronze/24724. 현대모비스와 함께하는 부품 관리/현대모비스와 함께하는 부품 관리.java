import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		for (int i = 1; i <= T; i++) {
			sb.append("Material Management ").append(i).append("\n");
			N = Integer.parseInt(br.readLine());
			br.readLine();
			while (--N >= 0)
				br.readLine();
			sb.append("Classification ---- End!\n");
		}
		System.out.print(sb);
	}
}