package ChristmasTree;

import java.util.Scanner;

public class ChristmasTree {
    private ChristmasTree(){
        Scanner scanner = new Scanner(System.in);
        boolean marker = false;
        int height;

        do {
            try {
                marker = true;
                System.out.println("Enter a height of the Christmas tree:");
                height = scanner.nextInt();
                if (height % 2 == 0) {
                    System.out.println("Oh! Repeat please!");
                    marker = false;
                } else {
                    for (int i = 0; i < height; i++) {
                        for(int j = 0; j < height - i; j++) {
                            System.out.print(" ");
                        }
                        for(int j = 0; j <= 2 * i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            } catch (Exception e){
                System.out.println("Ops! Input error \nThe program was finished");
            }
        } while (marker == false);
    }

    public static void main(String[] args) {
        ChristmasTree tr = new ChristmasTree();
    }
}
