import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, sum = 0, min = Integer.MAX_VALUE, minUniv = -1;
		String[] univ = new String[] { "Soongsil", "Korea", "Hanyang" };
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			x = Integer.parseInt(st.nextToken());
			sum += x;
			if (x < min) {
				min = x;
				minUniv = i;
			}
		}
		if (sum < 100)
			System.out.println(univ[minUniv]);
		else
			System.out.println("OK");
	}
}