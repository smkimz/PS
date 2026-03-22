import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[3];
		for (int i = 0; i < 3; i++)
			a[i] = Integer.parseInt(st.nextToken());
		a[2] *= 2;
		int x = a[0] - a[2], y = a[1] - a[2];
		x = x > 0 ? x : 0;
		y = y > 0 ? y : 0;
		System.out.println(x * y);
	}
}