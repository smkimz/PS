import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), D, M, energy = 0, hyu, l = 0;
		char[] S = br.readLine().concat(" ").toCharArray(), counter = new char[128];
		StringTokenizer st = new StringTokenizer(br.readLine());
		D = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for (int i = 0; i <= N; i++) {
			if (S[i] == 'H' || S[i] == 'Y' || S[i] == 'U' || S[i] == ' ') {
				energy += Math.min(l * D, D + M);
				++counter[S[i]];
				l = 0;
			} else
				++l;
		}
		hyu = Math.min(counter['H'], Math.min(counter['Y'], counter['U']));
		sb.append(energy == 0 ? "Nalmeok" : energy).append("\n").append(hyu == 0 ? "I love HanYang University" : hyu);
		System.out.print(sb);
	}
}