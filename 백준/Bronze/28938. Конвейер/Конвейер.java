import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), c = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			c += Integer.parseInt(st.nextToken());
		if (c == 0)
			System.out.println("Stay");
		else
			System.out.println(c > 0 ? "Right" : "Left");
	}
}