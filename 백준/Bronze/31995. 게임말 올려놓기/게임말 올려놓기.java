import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, M = Integer.parseInt(br.readLine()) - 1;
		if (N == 0 || M == 0)
			System.out.println(0);
		else
			System.out.println(N * M * 2);
	}
}