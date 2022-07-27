import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception{

        System.out.println("Returns Callable " + getCallableInteger().call());
    }
    public static Callable<Integer> getCallableInteger() {
        // your code here
        Callable<Integer> intCallable = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            Integer num = scanner.nextInt();
            return num;
        };

        return intCallable;
    }
}