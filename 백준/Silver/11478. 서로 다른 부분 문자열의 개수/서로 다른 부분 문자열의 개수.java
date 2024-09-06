import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> substrs = new HashSet<>();
		int len = str.length();
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j <= len - i; j++)
				substrs.add(str.substring(j, j + i));
		}
		System.out.print(substrs.size());
	}
}