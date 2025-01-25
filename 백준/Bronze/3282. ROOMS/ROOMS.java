import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), G = Integer.parseInt(st.nextToken()), guest, x = 0;
		int[] rooms = new int[N];
		ArrayDeque<Integer> oneGuestRooms = new ArrayDeque<>();
		while (--G >= 0) {
			guest = Integer.parseInt(br.readLine());
			while (guest > 1 && x < N) {
				rooms[x] = 2;
				guest -= 2;
				++x;
			}
			if (guest == 1 && x < N) {
				rooms[x] = 1;
				oneGuestRooms.add(x);
				++x;
			} else if (guest >= 1 && x >= N) {
				while (--guest >= 0)
					rooms[oneGuestRooms.poll()] = 2;
			}
		}
		for (int i = 0; i < N; i++)
			sb.append(rooms[i]).append("\n");
		System.out.print(sb);
	}
}