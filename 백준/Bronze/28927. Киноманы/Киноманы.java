import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int time = 0;
		int[] movieTime = new int[] { 3, 20, 120 };
		for (int i = -1; i <= 1; i += 2) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++)
				time += i * Integer.parseInt(st.nextToken()) * movieTime[j];
		}
		if (time == 0)
			System.out.println("Draw");
		else
			System.out.println(time < 0 ? "Max" : "Mel");
	}
}