import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int x = str.length;
		for (int i = 1; i < str.length; i++) {
			if (str[i] != str[i - 1]) {
				x = i;
				break;
			}
		}
		System.out.println(x);
	}
}