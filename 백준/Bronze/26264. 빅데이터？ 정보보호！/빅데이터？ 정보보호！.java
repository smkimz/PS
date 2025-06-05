import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0, idx = 0;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			if (str[idx] == 's') {
				++x;
				idx += 8;
			} else if (str[idx] == 'b') {
				++y;
				idx += 7;
			}
		}
		if (x == y)
			System.out.println("bigdata? security!");
		else
			System.out.println(x > y ? "security!" : "bigdata?");
	}
}