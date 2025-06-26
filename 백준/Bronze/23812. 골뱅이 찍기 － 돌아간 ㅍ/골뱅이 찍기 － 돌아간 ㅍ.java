import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean flag;
		String x = "", y = "", a = "", b = "";
		for (int i = 0; i < N; i++) {
			a += '@';
			b += ' ';
		}
		for (int i = 0; i < 5; i++)
			y += a;
		x += a;
		for (int i = 0; i < 3; i++)
			x += b;
		x += a;
		for (int i = 0; i < 5; i++) {
			flag = i % 2 == 0 ? false : true;
			for (int j = 0; j < N; j++)
				sb.append(flag ? y : x).append("\n");
		}
		System.out.print(sb);
	}
}