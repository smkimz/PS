import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
		System.out.println(B * 7 + A > 30 ? 0 : 1);
	}
}
