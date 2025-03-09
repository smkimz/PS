import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int happy = 0, sad = 0;
		for (int i = 2; i < str.length; i++) {
			if (str[i - 1] == '-' && str[i - 2] == ':') {
				if (str[i] == ')')
					++happy;
				else if (str[i] == '(')
					++sad;
			}
		}
		if (happy == 0 && sad == 0)
			System.out.println("none");
		else if (happy == sad)
			System.out.println("unsure");
		else
			System.out.println(happy > sad ? "happy" : "sad");
	}
}