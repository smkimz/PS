import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lyrics = new String[] { "baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in",
				"bed", "tururu", "turu", "baby", "sukhwan" };
		int N = Integer.parseInt(br.readLine()) - 1, x = N % 14, k = N / 14;
		String res = lyrics[x];
		if (res.charAt(0) == 't') {
			if (res.length() == 6 && k >= 3)
				res = "tu+ru*" + (k + 2);
			else if (res.length() == 4 && k >= 4)
				res = "tu+ru*" + (k + 1);
			else {
				for (int i = 0; i < k; i++)
					res = res.concat("ru");
			}
		}
		System.out.println(res);
	}
}