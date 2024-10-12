import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] steps = new int[4];
		for (int i = 0; i < 4; i++)
			steps[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(steps);
		System.out.println(steps[0] * steps[2]);
	}
}