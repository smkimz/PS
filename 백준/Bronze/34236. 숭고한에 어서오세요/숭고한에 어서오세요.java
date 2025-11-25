import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a1, a2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		a1 = Integer.parseInt(st.nextToken());
		a2 = Integer.parseInt(st.nextToken());
		System.out.println(a1 + N * (a2 - a1));
	}
}
