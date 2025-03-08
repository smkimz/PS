import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("0");
		int[] count = new int[2];
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '@')
					++count[i];
			}
		}
		System.out.printf("%d %d", count[0], count[1]);
	}
}