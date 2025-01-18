import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] X = new int[3];
		for (int i = 0; i < 3; i++)
			X[i] = Integer.parseInt(st.nextToken());
		X[0] += X[2];
		if (X[0] < X[1])
			System.out.println(X[1]);
		else
			System.out.println(X[0]);
	}
}