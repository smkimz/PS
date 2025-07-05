import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = 0;
		for (int i = 1; i <= 3; i++)
			score += i * Integer.parseInt(br.readLine());
		System.out.println(score >= 10 ? "happy" : "sad");
	}
}