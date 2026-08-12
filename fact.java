import java.util.Scanner;
class fact {
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
        int n = 5;

        System.out.println("Factorial of " + n + " = " + Fact.fact(n));
    }
}

