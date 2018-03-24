package sum;

import java.util.Scanner;
import java.lang.Exception;

public class SumOfEntered {
    private SumOfEntered(){
        int num, operand, res;
        boolean marker;
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Введите четырехзначное число.");
                String s = scanner.next();
                num = Integer.parseInt(s);
                if (s.length()==4) {
                    System.out.println("Successful " + num);
                    marker = false;
                    res = num%10;
                    res += (num%100 - res)/10;
                    operand = num%100;
                    res += (num%1000 - operand)/100;
                    operand =num%1000/100;
                    res += (num%10000 - operand)/1000;
                    System.out.println("Сумма цифр числа " + num + " равна " +res);
                } else{
                    System.out.println("Ops!");
                    marker = true;
                }
            } while (marker == true);
        } catch (Exception e){
            System.out.println("Вы ввели дичь");
        }
        System.out.println("Выполнено");
    }

    public static void main(String[] args) {
        SumOfEntered s = new SumOfEntered();
    }
}
