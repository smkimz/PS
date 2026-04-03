import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] t = new int[][] { { 0, 2, 4 }, { 2, 0, 2 }, { 4, 2, 0 } };
		int[] p = new int[3];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++)
			p[i] = Integer.parseInt(br.readLine());
		for (int i = 0; i < 3; i++)
			min = Math.min(p[0] * t[i][0] + p[1] * t[i][1] + p[2] * t[i][2], min);
		System.out.println(min);
	}
}