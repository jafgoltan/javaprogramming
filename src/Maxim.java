

 import java.util.Scanner;

    public class Maxim {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x,n, max;
            System.out.println("Enter Number Of N:");
            n = input.nextInt();
            System.out.println("Enter x:");
            x = input.nextInt();
            max = x;
            for (int i = 2; i <= n; i++) {
                if (x > max)
                    max = x;
            }
            System.out.println("Max Num is " + max);
        }
    }

