public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int factor)
    {
        int sum = 1;
        while (factor > 0)
        {
            sum *= factor;
            factor--;
        }
        return sum;
    }
}
