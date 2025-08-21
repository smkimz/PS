import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] table = new char[128];
		for (int i = 0; i < 128; i++)
			table[i] = (char) i;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			table[(int) st.nextToken().charAt(0)] = st.nextToken().charAt(0);
		}
		N = Integer.parseInt(br.readLine());
		while (--N >= 0)
			sb.append(table[(int) br.readLine().charAt(0)]);
		System.out.print(sb);
	}
}