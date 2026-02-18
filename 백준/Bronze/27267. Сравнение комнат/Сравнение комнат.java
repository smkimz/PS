import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] x = new int[] { 1, 1 };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				x[i] *= Integer.parseInt(st.nextToken());
		}
		if (x[0] == x[1])
			System.out.println('E');
		else
			System.out.println(x[0] > x[1] ? 'M' : 'P');
	}
}