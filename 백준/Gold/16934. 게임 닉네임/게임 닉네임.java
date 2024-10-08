import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<String> prefixes = new HashSet<>();
		HashMap<String, Integer> nicknames = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), num;
		String input, nickname;
		boolean isNicknameSelected;
		while (--N >= 0) {
			input = br.readLine();
			nickname = "";
			isNicknameSelected = false;
			for (int i = 0; i < input.length(); i++) {
				nickname += input.charAt(i);
				if (prefixes.contains(nickname))
					continue;
				prefixes.add(nickname);
				if (isNicknameSelected)
					continue;
				sb.append(nickname).append("\n");
				isNicknameSelected = true;
			}
			if (!nicknames.containsKey(input)) {
				nicknames.put(input, 2);
				if (isNicknameSelected)
					continue;
				sb.append(input).append("\n");
			} else if (!isNicknameSelected) {
				num = nicknames.get(input);
				sb.append(input).append(num).append("\n");
				nicknames.put(input, num + 1);
			}
		}
		System.out.print(sb);
	}
}