import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str, regex = "(?i)(?<=\\W|^)Nemo(?=\\W|$)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		while (true) {
			str = br.readLine();
			if (str.equals("EOI"))
				break;
			matcher = pattern.matcher(str);
			if (matcher.find())
				sb.append("Found\n");
			else
				sb.append("Missing\n");
		}
		System.out.print(sb);
	}
}
