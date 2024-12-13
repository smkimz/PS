import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Character> moss = new HashMap<>();
		moss.put(".-", 'A');
		moss.put("-...", 'B');
		moss.put("-.-.", 'C');
		moss.put("-..", 'D');
		moss.put(".", 'E');
		moss.put("..-.", 'F');
		moss.put("--.", 'G');
		moss.put("....", 'H');
		moss.put("..", 'I');
		moss.put(".---", 'J');
		moss.put("-.-", 'K');
		moss.put(".-..", 'L');
		moss.put("--", 'M');
		moss.put("-.", 'N');
		moss.put("---", 'O');
		moss.put(".--.", 'P');
		moss.put("--.-", 'Q');
		moss.put(".-.", 'R');
		moss.put("...", 'S');
		moss.put("-", 'T');
		moss.put("..-", 'U');
		moss.put("...-", 'V');
		moss.put(".--", 'W');
		moss.put("-..-", 'X');
		moss.put("-.--", 'Y');
		moss.put("--..", 'Z');
		moss.put(".----", '1');
		moss.put("..---", '2');
		moss.put("...--", '3');
		moss.put("....-", '4');
		moss.put(".....", '5');
		moss.put("-....", '6');
		moss.put("--...", '7');
		moss.put("---..", '8');
		moss.put("----.", '9');
		moss.put("-----", '0');
		moss.put("--..--", ',');
		moss.put(".-.-.-", '.');
		moss.put("..--..", '?');
		moss.put("---...", ':');
		moss.put("-....-", '-');
		moss.put(".--.-.", '@');
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (--N >= 0)
			sb.append(moss.get(st.nextToken()));
		System.out.println(sb);
	}
}