import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] socks = new boolean[10];
		int x;
		for (int i = 0; i < 5; i++) {
			x = Integer.parseInt(br.readLine());
			if (socks[x])
				socks[x] = false;
			else
				socks[x] = true;
		}
		for (int i = 0; i <= 9; i++) {
			if (socks[i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
