import java.util.Scanner;

public class task1
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введите целое число от -100 до 100");
        int a = console.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("введите другое число");
            output(a);
        }
        console.close();
    }
    public static void output(int a) {
        Scanner consoleNext = new Scanner(System.in);
        while(consoleNext.hasNextInt()) {
            a = consoleNext.nextInt();
            if (a > 7) {
                System.out.println("Привет");
                break;
            } else {
                System.out.println("введите другое число");
            }
        }
        consoleNext.close();
    }
}

