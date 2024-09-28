import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, left, right, sum;
		if (N <= 2) {
			System.out.println(0);
			return;
		}
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		for (int i = 0; i < N; i++) {
			left = 0;
			right = N - 1;
			while (left < right) {
				sum = list.get(left) + list.get(right);
				if (sum > list.get(i))
					--right;
				else if (sum < list.get(i))
					++left;
				else {
					if (left == i)
						++left;
					else if (right == i)
						--right;
					else {
						++ans;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}