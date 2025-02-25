import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		boolean[] X = new boolean['Z' + 1];
		for (int i = 0; i < str.length; i++)
			X[str[i]] = true;
		if (X['M'] && X['O'] && X['B'] && X['I'] && X['S'])
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}