import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		if (nums[0] < nums[1])
			System.out.println(nums[1]);
		else if (nums[0] > nums[2])
			System.out.println(nums[2]);
		else
			System.out.println(nums[0]);
	}
}