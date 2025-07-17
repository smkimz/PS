import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] name, anj = new char[] { 'a', 'n', 'j' };
		boolean checker;
		while (--N >= 0) {
			name = br.readLine().toCharArray();
			if (name.length != 3)
				continue;
			checker = false;
			for (int i = 0; i < 3; i++) {
				if (name[i] != anj[i]) {
					checker = true;
					break;
				}
			}
			if (checker)
				continue;
			System.out.println("뭐야;");
			return;
		}
		System.out.println("뭐야?");
	}
}