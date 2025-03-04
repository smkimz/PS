import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[] name;
		char next;
		for (int i = 1; i <= N; i++) {
			sb.append("String #").append(i).append("\n");
			name = br.readLine().toCharArray();
			for (int j = 0; j < name.length; j++) {
				next = (char) (name[j] + 1);
				sb.append(next > 'Z' ? 'A' : next);
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}