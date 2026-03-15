import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String name;
		while (true) {
			name = br.readLine();
			if (name.equals("yonsei") || name.equals("korea")) {
				System.out.println(name.equals("yonsei") ? "Yonsei Won!" : "Yonsei Lost...");
				return;
			}
		}
	}
}