import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder res = new StringBuilder(), a = new StringBuilder();
		int R = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine());
		for (int i = 0; i < C; i++)
			a.append('*');
		for (int i = 0; i < R; i++)
			res.append(a).append("\n");
		System.out.print(res);
	}
}