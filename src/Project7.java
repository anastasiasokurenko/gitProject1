public class Project7 {
    //Write a Java Program to print the first 10 numbers of
    //Fibonacci series
    public static void main(String[] args) {
        int n = 10, num1 = 0, num2 = 1;
        System.out.print("First " + n + " numbers of Fibonacci series are ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
