import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), sum = 0;
		st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			sum += Integer.parseInt(st.nextToken());
		System.out.println(sum % X == 0 ? '1' : '0');
	}
}