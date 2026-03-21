import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double d = Double.parseDouble(br.readLine()), w = Double.parseDouble(br.readLine());
		int n = Integer.parseInt(br.readLine());
		System.out.println(d * Math.PI / w >= n ? "YES" : "NO");
	}
}