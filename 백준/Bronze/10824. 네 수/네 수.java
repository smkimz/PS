import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] input = new String[4];
		for (int i = 0; i < 4; i++)
			input[i] = st.nextToken();
		int x = input[1].length(), y = input[3].length();
		long[] nums = new long[4];
		for (int i = 0; i < 4; i++)
			nums[i] = Long.parseLong(input[i]);
		System.out.println((nums[0] * (long) Math.pow(10, x) + nums[1]) + (nums[2] * (long) Math.pow(10, y) + nums[3]));
	}
}
