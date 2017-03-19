import java.util.Scanner;

/**
 * Created by kcain on 3/18/2017.
 */
public class Calculator {
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public int subtract(int a, int b) {
        int diff = a-b;
        return diff;
    }
    public int multiply(int a, int b) {
        int total = a*b;
        return total;
    }
    public int divide(int a, int b) {
        int total = a/b;
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
    }
}