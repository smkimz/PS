import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String cmd;
		int problem = 0;
		while (true) {
			cmd = br.readLine();
			if (cmd.equals("고무오리 디버깅 끝"))
				break;
			else if (cmd.equals("고무오리")) {
				if (problem <= 0)
					problem += 2;
				else
					--problem;
			} else
				++problem;
		}
		if (problem > 0)
			System.out.println("힝구");
		else
			System.out.println("고무오리야 사랑해");
	}
}