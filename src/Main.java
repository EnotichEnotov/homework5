import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int m= in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j) {
                a[i][j] = i*j;
            }
        }
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        }
    }


