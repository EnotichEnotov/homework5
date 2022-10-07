import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int m= in.nextInt();
        int ar[][] = new int[n][m];
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j) {
                ar[i][j] = in.nextInt();
            }

        }
        System.out.println(m + " " + n);
        for (int j = 0; j < m; ++j){
            for (int i = n-1; i >= 0; --i) {
                System.out.print(ar[i][j] + " " );
            }
            System.out.println();
        }
    }
}