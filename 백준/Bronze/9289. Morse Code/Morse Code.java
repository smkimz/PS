import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Character> M = new HashMap<String, Character>();
		M.put(".-", 'A');
		M.put("-...", 'B');
		M.put("-.-.", 'C');
		M.put("-..", 'D');
		M.put(".", 'E');
		M.put("..-.", 'F');
		M.put("--.", 'G');
		M.put("....", 'H');
		M.put("..", 'I');
		M.put(".---", 'J');
		M.put("-.-", 'K');
		M.put(".-..", 'L');
		M.put("--", 'M');
		M.put("-.", 'N');
		M.put("---", 'O');
		M.put(".--.", 'P');
		M.put("--.-", 'Q');
		M.put(".-.", 'R');
		M.put("...", 'S');
		M.put("-", 'T');
		M.put("..-", 'U');
		M.put("...-", 'V');
		M.put(".--", 'W');
		M.put("-..-", 'X');
		M.put("-.--", 'Y');
		M.put("--..", 'Z');
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			sb.append("Case ").append(i).append(": ");
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens())
				sb.append(M.get(st.nextToken()));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}