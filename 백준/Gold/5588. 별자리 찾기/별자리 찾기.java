import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()), N, dx, dy;
		ArrayList<Star> constellation = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		dx = Integer.parseInt(st.nextToken());
		dy = Integer.parseInt(st.nextToken());
		for (int i = 1; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			constellation.add(new Star(Integer.parseInt(st.nextToken()) - dx, Integer.parseInt(st.nextToken()) - dy));
		}
		N = Integer.parseInt(br.readLine());
		HashSet<Star> photo = new HashSet<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			photo.add(new Star(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		boolean isMatching;
		for (Star pStar : photo) {
			isMatching = true;
			for (Star cStar : constellation) {
				if (!photo.contains(new Star(cStar.x + pStar.x, cStar.y + pStar.y))) {
					isMatching = false;
					break;
				}
			}
			if (isMatching) {
				System.out.printf("%d %d", pStar.x - dx, pStar.y - dy);
				return;
			}
		}
	}

	static class Star {
		int x, y;

		public Star(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Star star = (Star) obj;
			return x == star.x && y == star.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
}
