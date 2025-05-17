import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), max = 0, count = 0;
		int[] height = new int[N];
		for(int i = 0; i < N; i++) {
			height[i] = Integer.parseInt(br.readLine());
			if(height[i] > max) {
				max = height[i];
				++count;
			}
		}
		sb.append(count).append("\n");
		max = 0;
		count = 0;
		for(int i = N-1; i >= 0; i--) {
			if(height[i] > max) {
				max = height[i];
				++count;
			}
		}
		sb.append(count);
		System.out.print(sb);
	}
}