import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		while (M != 0) {
			sb.append(M).append(" is ");
			if (M % N != 0)
				sb.append("NOT ");
			sb.append("a multiple of ").append(N).append(".\n");
			M = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}