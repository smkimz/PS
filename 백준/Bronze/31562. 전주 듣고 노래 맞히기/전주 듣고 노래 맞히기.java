import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		String name, sound;
		HashMap<String, String> songs = new HashMap<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			name = st.nextToken();
			sound = "";
			for (int i = 0; i < 3; i++)
				sound += st.nextToken().charAt(0);
			if (songs.containsKey(sound))
				songs.put(sound, "?");
			else
				songs.put(sound, name);
		}
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			sound = "";
			while (st.hasMoreTokens())
				sound += st.nextToken().charAt(0);
			if (songs.containsKey(sound))
				sb.append(songs.get(sound));
			else
				sb.append("!");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}