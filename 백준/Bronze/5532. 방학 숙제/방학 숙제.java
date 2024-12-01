import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()), A = Integer.parseInt(br.readLine()),
				B = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine()),
				D = Integer.parseInt(br.readLine());
		A = A / C + (A % C != 0 ? 1 : 0);
		B = B / D + (B % D != 0 ? 1 : 0);
		System.out.println(L - Math.max(A, B));
	}
}