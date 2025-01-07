import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()), D1, D2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		D1 = Integer.parseInt(st.nextToken());
		D2 = Integer.parseInt(st.nextToken());
		System.out.println(Math.pow(K, 2) - Math.pow((D1 - D2) / 2.0, 2));
	}
}