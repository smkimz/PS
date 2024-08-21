import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while (--T >= 0)
			sb.append(Long.parseLong(br.readLine()) * 2 - 1).append("\n");
		System.out.print(sb);
	}
}