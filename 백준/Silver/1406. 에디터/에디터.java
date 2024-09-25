import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayDeque<Character>[] editor = new ArrayDeque[2];
		for (int i = 0; i <= 1; i++)
			editor[i] = new ArrayDeque<>();
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++)
			editor[0].add(str[i]);
		int M = Integer.parseInt(br.readLine());
		char order;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			order = st.nextToken().charAt(0);
			switch (order) {
			case 'L':
				if (editor[0].isEmpty())
					continue;
				editor[1].addLast(editor[0].pollLast());
				break;
			case 'D':
				if (editor[1].isEmpty())
					continue;
				editor[0].addLast(editor[1].pollLast());
				break;
			case 'B':
				if (editor[0].isEmpty())
					continue;
				editor[0].pollLast();
				break;
			case 'P':
				editor[0].addLast(st.nextToken().charAt(0));
				break;
			default:
				break;
			}
		}
		while (!editor[0].isEmpty())
			sb.append(editor[0].pollFirst());
		while (!editor[1].isEmpty())
			sb.append(editor[1].pollLast());
		System.out.print(sb);
	}
}