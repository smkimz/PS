import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double H;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			H = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()) * 2.0;
			sb.append("The height of the triangle is ").append(String.format("%.2f", H)).append(" units\n");
		}
		System.out.print(sb);
	}
}