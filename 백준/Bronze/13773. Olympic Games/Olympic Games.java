import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int year;
		while (true) {
			year = Integer.parseInt(br.readLine());
			if (year == 0)
				break;
			sb.append(year).append(" ");
			if (year % 4 == 0) {
				if (year >= 1896 && year < 2024) {
					if (year == 1916 || year == 1940 || year == 1944)
						sb.append("Games cancelled\n");
					else
						sb.append("Summer Olympics\n");
				} else if (year >= 2024)
					sb.append("No city yet chosen\n");
				else
					sb.append("No summer games\n");
			} else
				sb.append("No summer games\n");
		}
		System.out.print(sb);
	}
}