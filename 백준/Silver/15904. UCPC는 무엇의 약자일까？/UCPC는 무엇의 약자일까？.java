import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray(), ucpc = { 'U', 'C', 'P', 'C', '-' };
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (!(str[i] >= 'A' && str[i] <= 'Z') || str[i] != ucpc[cnt])
				continue;
			cnt++;
		}
		if (cnt != 4)
			System.out.println("I hate UCPC");
		else
			System.out.println("I love UCPC");
	}
}