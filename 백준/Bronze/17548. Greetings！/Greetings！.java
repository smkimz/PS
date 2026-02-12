import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String hey = new String(br.readLine());
		hey = hey.substring(1, hey.length() - 1);
		sb.append('h').append(hey).append(hey).append('y');
		System.out.print(sb);
	}
}