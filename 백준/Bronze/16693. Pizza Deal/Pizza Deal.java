import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		double P1 = A / Double.parseDouble(st.nextToken()), P2;
		st = new StringTokenizer(br.readLine());
		P2 = Math.pow(Double.parseDouble(st.nextToken()), 2) * Math.PI / Double.parseDouble(st.nextToken());
		System.out.println(P1 > P2 ? "Slice of pizza" : "Whole pizza");
	}
}