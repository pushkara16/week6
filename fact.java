import java.util.Scanner;
class Fact {
    static int fact(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(Fact.fact(n));
    }
}
