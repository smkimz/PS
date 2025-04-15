import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String name, president = "ZZZZZZ";
		while (--N >= 0) {
			name = br.readLine();
			if (name.length() != 3)
				continue;
			if (president.compareTo(name) > 0)
				president = name;
		}
		System.out.println(president);
	}
}