import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, res = 0;
		StringTokenizer sta = new StringTokenizer(br.readLine()), stb;
		while (--N >= 0) {
			stb = new StringTokenizer(br.readLine());
			if (sta.nextToken().charAt(0) == '0')
				continue;
			x = Integer.parseInt(stb.nextToken()) - Integer.parseInt(stb.nextToken());
			if (x >= 0)
				continue;
			res -= x;
		}
		System.out.println(res);
	}
}
