import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 0; i < N; i++)
			str += "* ";
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0)
				sb.append(str);
			else
				sb.append(" ").append(str);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}