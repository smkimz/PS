import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] table = new char[][] { { '=', '>', '>', '>', '>', '<' }, { '<', '=', '<', '=', '=', '<' },
				{ '<', '>', '=', '>', '>', '>' }, { '<', '=', '<', '=', '=', '<' }, { '<', '=', '<', '=', '=', '<' },
				{ '>', '>', '<', '>', '>', '=' } };
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		System.out.println(table[x][y]);
	}
}