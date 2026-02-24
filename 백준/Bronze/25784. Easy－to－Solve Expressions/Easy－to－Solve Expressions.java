import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] x = new int[3];
		for (int i = 0; i < 3; i++)
			x[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(x);
		if (x[0] + x[1] == x[2])
			System.out.println(1);
		else if (x[0] * x[1] == x[2])
			System.out.println(2);
		else
			System.out.println(3);
	}
}