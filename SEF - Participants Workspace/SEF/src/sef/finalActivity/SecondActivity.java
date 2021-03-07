public class SecondActivity {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("Sum of " + a + " and " + b + " = " + c.getSum(a, b));
        System.out.println("Difference of " + a + " and " + b + " = " + c.getDifference(a, b));
        System.out.println("Product of " + a + " and " + b + " = " + c.getProduct(a, b));
        System.out.println("Quotient of " + a + " and " + b + " = " + c.getQuotient(a, b));
    }
}
