
import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Input x : ");
        int x = input.nextInt();

        System.out.print("Input y : ");
        int y = input.nextInt();

        System.out.print("Input operator : ");
        char operation = input.next().charAt(0);

        input.close();

        int result = calculate(x, y, operation);
        PrintResult(result);
    }

    static void PrintResult(int result) {
        System.out.println(result);
    }

    static int calculate(int x1, int y1, char o) {
        int result = 0;
        switch (o) {
            case '+':
                result = x1 + y1;
                break;
            case '-':
                result = x1 - y1;
                break;
            case '*':
                result = x1 * y1;
                break;
            case '/':
                if (ValidateDenaminator(y1)) {
                    result = x1 / y1;
                } else {
                    System.out.println("Can't divide");
                }

                break;
        }

        return result;
    }

    static boolean ValidateDenaminator(int y) {
        if (y > 0) {
            return true;
        } else
            return false;

    }
}
