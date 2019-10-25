import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double ans = 0;
        for (int i=1;i<=n;i++){
            ans=ans+(double)(1)/((2*i-1)*(2*i));
        }
        System.out.println(ans);
    }
}
