import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), substr;
		HashMap<String, Boolean> substrs = new HashMap<>();
		int len = str.length();
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j <= len - i; j++) {
				substr = str.substring(j, j + i);
				if (substrs.containsKey(substr))
					continue;
				substrs.put(substr, true);
			}
		}
		System.out.print(substrs.size());
	}
}