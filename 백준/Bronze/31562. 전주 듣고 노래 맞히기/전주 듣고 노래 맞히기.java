import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		String[][][] sounds = new String[8][8][8];
		String name;
		char[] s;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			name = st.nextToken();
			s = new char[3];
			for (int i = 0; i < 3; i++)
				s[i] = (char) (st.nextToken().charAt(0) - 'A');
			if (sounds[s[0]][s[1]][s[2]] == null)
				sounds[s[0]][s[1]][s[2]] = name;
			else
				sounds[s[0]][s[1]][s[2]] = "?";
		}
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			s = new char[3];
			for (int i = 0; i < 3; i++)
				s[i] = (char) (st.nextToken().charAt(0) - 'A');
			if (sounds[s[0]][s[1]][s[2]] == null)
				sb.append("!");
			else
				sb.append(sounds[s[0]][s[1]][s[2]]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}