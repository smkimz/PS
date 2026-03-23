import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[4];
		for (int i = 0; i < 4; i++)
			a[i] = Integer.parseInt(st.nextToken());
		int x = a[0] * 3 - a[1];
		if (x <= 0) {
			System.out.println(0);
			return;
		}
		System.out.println(x * a[2] + a[3]);
	}
}