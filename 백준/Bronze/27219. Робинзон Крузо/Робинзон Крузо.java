import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), X = N / 5, Y = N % 5;
		for (int i = 0; i < X; i++)
			sb.append('V');
		for (int i = 0; i < Y; i++)
			sb.append('I');
		System.out.print(sb);
	}
}