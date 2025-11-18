import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = 0;
		for (int i = 0; i < 4; i++)
			s += Integer.parseInt(br.readLine());
		System.out.println(s <= 1500 ? "Yes" : "No");
	}
}
