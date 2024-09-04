import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int K = Integer.parseInt(br.readLine()), max = 0, idx = 0;
		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}

		idx = (idx + 1) % 6;
		System.out.println(((arr[idx] * arr[(idx + 1) % 6]) + (arr[(idx + 3) % 6] * arr[(idx + 4) % 6])) * K);
	}
}