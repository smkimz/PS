import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N;
		char[] str, alphabets = new char[28];
		int[] order = new int[128];
		for (int i = 'A'; i <= 'Z'; i++) {
			alphabets[i - 'A'] = (char) i;
			order[i] = i - 'A';
		}
		alphabets[26] = '_';
		alphabets[27] = '.';
		order['_'] = 26;
		order['.'] = 27;
		while (true) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if (N == 0)
				break;
			str = st.nextToken().toCharArray();
			for (int i = str.length - 1; i >= 0; i--)
				sb.append(alphabets[(order[str[i]] + N) % 28]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}