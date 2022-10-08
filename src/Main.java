import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int m = 0;
        if(n % 2 != 0){
            a[(n / 2)][(n / 2)] = (n * n);
        }

        for(int i = 0; i < (n / 2); i++){
            for(int j = i; j < (n - i); j++){
                a[i][j] = m;
                m++;
            }


            for(int j = 1; j < (n - i - i); j++){
                a[(j + i)][(n - i) - 1] = m;
                m++;
            }



            for(int j = (n - 2) - i; j >= i; j--){
                a[(n - i) - 1][(j)] = m;
                m++;
            }

            for(int j = ((n - i) - 2); j > i; j--){
                a[j][i] = m;
                m++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t") ;
            }
            System.out.println("");
        }
    }
}