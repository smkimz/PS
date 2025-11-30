import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine()), E = Integer.parseInt(br.readLine()), Q;
		char S;
		while (--E >= 0) {
			S = br.readLine().charAt(0);
			Q = Integer.parseInt(br.readLine());
			D += S == '+' ? Q : -Q;
		}
		System.out.println(D);
	}
}
