import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double[][] arr = new double[2][2];
		int x, y;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++)
				arr[i][j] = Double.parseDouble(st.nextToken());
		}
		x = (int) Math.ceil(arr[1][1] / arr[0][0]);
		y = (int) Math.ceil(arr[0][1] / arr[1][0]);
		if (x < y)
			System.out.println("PLAYER A");
		else if (x > y)
			System.out.println("PLAYER B");
		else
			System.out.println("DRAW");
	}
}