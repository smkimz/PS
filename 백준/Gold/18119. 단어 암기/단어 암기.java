import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), memory = (1 << 26) - 1, x, ret;
		int[] words = new int[N];
		char[] word;
		char cmd;
		for (int i = 0; i < N; i++) {
			word = br.readLine().toCharArray();
			for (int j = 0; j < word.length; j++)
				words[i] |= 1 << (word[j] - 'a');
		}
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken().charAt(0);
			x = 1 << (st.nextToken().charAt(0) - 'a');
			if (cmd == '1')
				memory &= ~x;
			else
				memory |= x;
			ret = 0;
			for (int i = 0; i < N; i++) {
				if ((words[i] & memory) == words[i])
					++ret;
			}
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}