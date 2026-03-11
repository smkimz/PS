import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 2;
		int[] x = new int[3];
		x[0] = Integer.parseInt(br.readLine());
		x[1] = Integer.parseInt(br.readLine());
		while (x[0] >= x[1]) {
			++i;
			x[2] = x[0] - x[1];
			x[0] = x[1];
			x[1] = x[2];
		}
		System.out.println(i);
	}
}