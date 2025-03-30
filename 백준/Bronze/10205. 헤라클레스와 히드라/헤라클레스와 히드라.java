import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), h;
		char[] str;
		for (int i = 1; i <= K; i++) {
			sb.append("Data Set ").append(i).append(":\n");
			h = Integer.parseInt(br.readLine());
			str = br.readLine().toCharArray();
			for (int j = 0; j < str.length; j++) {
				if (str[j] == 'b')
					--h;
				else
					++h;
			}
			sb.append(h).append("\n\n");
		}
		System.out.print(sb);
	}
}
