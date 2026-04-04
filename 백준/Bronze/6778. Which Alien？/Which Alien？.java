import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
		if (x >= 3 && y <= 4)
			sb.append("TroyMartian\n");
		if (x <= 6 && y >= 2)
			sb.append("VladSaturnian\n");
		if (x <= 2 && y <= 3)
			sb.append("GraemeMercurian\n");
		System.out.print(sb);
	}
}