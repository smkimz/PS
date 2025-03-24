import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true) {
            try {
                sc.nextLine();
                ans++;
            } catch (Exception e) {
            	System.out.println(ans);
                return;
            }
        }
    }
}