import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine()), min = Math.min(N, M),
				max = Math.max(N, M);
		System.out.println(min * 2 + ((max - min) % 2 == 1 ? 1 : 0));
	}
}