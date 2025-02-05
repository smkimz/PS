import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double R = Double.parseDouble(st.nextToken()), C = Double.parseDouble(st.nextToken()),
				N = Double.parseDouble(st.nextToken());
		R = Math.ceil(R / N);
		C = Math.ceil(C / N);
		System.out.println((long) (R * C));
	}
}