import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] X = new int[4];
		for (int i = 0; i < 4; i++)
			X[i] = Integer.parseInt(st.nextToken());
		X[0] += X[1];
		if (X[0] <= X[3]) {
			if (X[2] <= X[3])
				System.out.println("~.~");
			else
				System.out.println("Shuttle");
		} else {
			if (X[2] <= X[3])
				System.out.println("Walk");
			else
				System.out.println("T.T");
		}
	}
}
