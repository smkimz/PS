import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0;
		char[] S = br.readLine().toCharArray();
		for (int i = 0; i < N; i++)
			X += S[i] == '2' ? 1 : -1;
		if (X == 0)
			System.out.println("yee");
		else
			System.out.println(X > 0 ? '2' : 'e');
	}
}