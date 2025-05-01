import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "(");
		sb.append(st.nextToken()).append("\n");
		if (st.countTokens() == 1)
			sb.append(st.nextToken()).deleteCharAt(sb.length() - 1);
		else
			sb.append('-');
		System.out.println(sb);
	}
}
