import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] N = new double[3];
		for (int i = 0; i < 3; i++)
			N[i] = Double.parseDouble(st.nextToken());
		double X = N[0] * N[1] / N[2], Y = N[0] / N[1] * N[2];
		System.out.println((int) X > (int) Y ? (int) X : (int) Y);
	}
}