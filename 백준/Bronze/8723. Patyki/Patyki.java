import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int[] len = new int[3];
		while (st.hasMoreTokens())
			pq.add(Integer.parseInt(st.nextToken()));
		for (int i = 0; i < 3; i++)
			len[i] = pq.poll();
		if (len[0] == len[1] && len[1] == len[2])
			System.out.println(2);
		else if (Math.pow(len[0], 2) + Math.pow(len[1], 2) == Math.pow(len[2], 2))
			System.out.println(1);
		else
			System.out.println(0);
	}
}