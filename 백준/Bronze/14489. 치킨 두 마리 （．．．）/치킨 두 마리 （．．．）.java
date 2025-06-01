import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()),
				Y = Integer.parseInt(br.readLine()) * 2;
		System.out.println(X >= Y ? X - Y : X);
	}
}