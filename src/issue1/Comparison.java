package issue1;
import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int b = k%10;
        int a = ((k - b)%100)/10;
        System.out.println(a+ " " +b);

        if (a == b) System.out.println("The first and second number are equal\n");
        else {
            if (a>b) System.out.println("The first number is grater than second \n");
            else System.out.println("The second number is greater than firs \n");
            System.out.println("The first and second number aren't equal\n");
        }
    }
}
