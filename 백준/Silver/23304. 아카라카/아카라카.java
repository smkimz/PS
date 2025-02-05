import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int len = S.length;
		while (len > 0) {
			for (int i = 0; i < len / 2; i++) {
				if (S[i] == S[len - i - 1])
					continue;
				System.out.println("IPSELENTI");
				return;
			}
			len /= 2;
		}
		System.out.println("AKARAKA");
	}
}