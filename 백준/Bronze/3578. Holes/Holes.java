import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 0)
			System.out.println(1);
		else if (N == 1)
			System.out.println(0);
		else {
			StringBuilder sb = new StringBuilder();
			if (N % 2 == 1)
				sb.append(4);
			for (int i = 0; i < N / 2; i++)
				sb.append(8);
			System.out.println(sb);
		}
	}
}