import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> seminarMap = new HashMap<String, Integer>();
		String[] seminars = new String[] { "Algorithm 204", "DataAnalysis 207", "ArtificialIntelligence 302",
				"CyberSecurity -101", "Network 303", "Startup 501", "TestStrategy 105" };
		StringTokenizer st;
		for (int i = 0; i < seminars.length; i++) {
			st = new StringTokenizer(seminars[i]);
			seminarMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		int N = Integer.parseInt(br.readLine()), room;
		String seminar;
		while (--N >= 0) {
			seminar = br.readLine();
			room = seminarMap.get(seminar);
			sb.append(room < 0 ? "B" + room * -1 : room).append("\n");
		}
		System.out.print(sb);
	}
}
