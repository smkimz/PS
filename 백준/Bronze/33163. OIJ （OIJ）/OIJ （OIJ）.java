import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[] S = br.readLine().toCharArray(), change = new char['O' + 1];
		change['J'] = 'O';
		change['O'] = 'I';
		change['I'] = 'J';
		for (int i = 0; i < N; i++)
			sb.append(change[S[i]]);
		System.out.print(sb);
	}
}