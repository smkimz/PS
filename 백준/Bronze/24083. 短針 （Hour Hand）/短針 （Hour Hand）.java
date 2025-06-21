import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), ret = (A + B) % 12;
		System.out.println(ret == 0 ? 12 : ret);
	}
}