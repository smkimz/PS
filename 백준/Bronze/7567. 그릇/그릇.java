import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] bowl = br.readLine().toCharArray();
		int height = 10;
		for (int i = 1; i < bowl.length; i++) {
			if (bowl[i] == bowl[i - 1])
				height += 5;
			else
				height += 10;
		}
		System.out.println(height);
	}
}