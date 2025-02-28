import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		char maskot = br.readLine().charAt(0);
		int K = Integer.parseInt(br.readLine());
		if (K == 1) {
			if (maskot == 'a')
				System.out.println(1);
			else
				System.out.println(2);
		} else {
			if (maskot == 'a') {
				if (K % 2 == 0)
					System.out.println(K - 1);
				else
					System.out.println(K);
			} else {
				if (K % 2 == 0)
					System.out.println(K);
				else
					System.out.println(K - 1);
			}
		}
	}
}