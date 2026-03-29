import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] wh = br.readLine().toCharArray();
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < 10; i++) {
			if (wh[i] == '.')
				continue;
			else if (wh[i] == '@')
				x = i;
			else if (wh[i] == '#')
				y = i;
			else if (wh[i] == '!')
				z = i;
		}
		if ((x < y && y < z) || (x > y && y > z))
			System.out.println(Math.abs(x - z) - 1);
		else
			System.out.println(-1);
	}
}