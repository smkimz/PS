import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length - 1; i++) {
			if ((str[i] == 'D' || str[i] == 'd') && str[i + 1] == '2') {
				System.out.println("D2");
				return;
			}
		}
		System.out.println("unrated");
	}
}