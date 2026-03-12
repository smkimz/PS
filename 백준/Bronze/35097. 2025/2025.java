import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n, ret;
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			ret = 0;
			for (int i = 1; i <= n; i++)
				ret += i * n * (n + 1) / 2;
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}