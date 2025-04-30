import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ret = 0;
		char[] name = br.readLine().toCharArray();
		for (int i = 0; i < N; i++)
			ret += name[i] - 'A' + 1;
		System.out.print(ret);
	}
}
