import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) * 100 + Integer.parseInt(br.readLine());
		if (N == 218)
			System.out.println("Special");
		else
			System.out.println(N > 218 ? "After" : "Before");
	}
}
