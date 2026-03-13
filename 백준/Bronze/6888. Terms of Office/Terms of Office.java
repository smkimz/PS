import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int X = Integer.parseInt(br.readLine()), Y = Integer.parseInt(br.readLine());
		for (int i = X; i <= Y; i += 60)
			sb.append("All positions change in year ").append(i).append("\n");
		System.out.print(sb);
	}
}