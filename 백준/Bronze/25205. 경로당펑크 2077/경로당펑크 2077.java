import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[128];
		arr['q'] = 1;
		arr['w'] = 1;
		arr['e'] = 1;
		arr['r'] = 1;
		arr['t'] = 1;
		arr['a'] = 1;
		arr['s'] = 1;
		arr['d'] = 1;
		arr['f'] = 1;
		arr['g'] = 1;
		arr['z'] = 1;
		arr['x'] = 1;
		arr['c'] = 1;
		arr['v'] = 1;
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		System.out.println(arr[s.charAt(N - 1)]);
	}
}