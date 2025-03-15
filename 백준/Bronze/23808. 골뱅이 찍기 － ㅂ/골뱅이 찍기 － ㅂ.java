import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String atSign = "", blank = "", line;
		for (int i = 0; i < N; i++) {
			atSign += "@";
			blank += "   ";
		}
		line = atSign + blank + atSign + "\n";
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++)
				sb.append(line);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++)
				sb.append(atSign);
			sb.append("\n");
		}
		for (int i = 0; i < N; i++)
			sb.append(line);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++)
				sb.append(atSign);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}