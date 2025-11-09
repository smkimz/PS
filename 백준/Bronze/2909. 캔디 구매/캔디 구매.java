import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double C = Double.parseDouble(st.nextToken()), D;
		int K = Integer.parseInt(st.nextToken());
		D = Math.pow(10, K);
		C = Math.round(C / D) * D;
		System.out.println((int) C);
	}
}
