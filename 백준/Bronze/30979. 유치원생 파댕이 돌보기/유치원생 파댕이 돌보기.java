import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			sum += Integer.parseInt(st.nextToken());
		System.out.println(T <= sum ? "Padaeng_i Happy" : "Padaeng_i Cry");
	}
}