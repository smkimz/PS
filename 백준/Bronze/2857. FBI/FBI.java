import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String name;
		for (int i = 1; i <= 5; i++) {
			name = br.readLine();
			if (name.contains("FBI"))
				sb.append(i).append(" ");
		}
		if (sb.length() == 0)
			System.out.println("HE GOT AWAY!");
		else
			System.out.println(sb);
	}
}