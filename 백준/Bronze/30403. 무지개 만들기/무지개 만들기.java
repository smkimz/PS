import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0;
		char[] str = br.readLine().toCharArray(), roygbiv = new char[] { 'r', 'o', 'y', 'g', 'b', 'i', 'v' },
				ROYGBIV = new char[] { 'R', 'O', 'Y', 'G', 'B', 'I', 'V' };
		boolean[] strChecker = new boolean[128];
		for (int i = 0; i < N; i++)
			strChecker[str[i]] = true;
		for (int i = 0; i < 7; i++) {
			if (strChecker[roygbiv[i]])
				++x;
			if (strChecker[ROYGBIV[i]])
				++y;
		}
		if (x == 7 && y == 7)
			System.out.println("YeS");
		else if (x == 7)
			System.out.println("yes");
		else if (y == 7)
			System.out.println("YES");
		else
			System.out.println("NO!");
	}
}