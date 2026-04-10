import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 12, y;
		int[] mv = new int[] { 0, 1, 2, -1 };
		char[] dir = new char[] { 'N', 'E', 'S', 'W' };
		for (int i = 0; i < 10; i++) {
			y = Integer.parseInt(br.readLine());
			x += mv[y];
		}
		System.out.println(dir[x % 4]);
	}
}