import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] alphabets = br.readLine().toCharArray();
		int[] nums = new int[3];
		while (st.hasMoreTokens())
			pq.add(Integer.parseInt(st.nextToken()));
		for (int i = 0; i < 3; i++)
			nums[i] = pq.poll();
		for (int i = 0; i < 3; i++)
			sb.append(nums[alphabets[i] - 'A']).append(" ");
		System.out.print(sb);
	}
}