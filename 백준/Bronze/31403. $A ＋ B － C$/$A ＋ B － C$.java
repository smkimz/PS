import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();
		int C = Integer.parseInt(br.readLine());
		sb.append(Integer.valueOf(A) + Integer.valueOf(B) - C).append("\n").append(Integer.valueOf(A + B) - C);
		System.out.println(sb);
	}
}