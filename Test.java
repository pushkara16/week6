public class Test {

    public static void main(String[] args) {
        int n = 5;
        int expected = 120;

        int result = Fact.fact(n);

        if (result == expected) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
