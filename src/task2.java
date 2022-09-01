import java.util.Scanner;

public class task2
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введите Ваше имя:");
        String name = console.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            while (console.hasNextLine()) {
                name = console.nextLine();
                if (name.equals("Вячеслав")) {
                    System.out.println("Привет, " + name);
                    break;
                } else {
                    System.out.println("Нет такого имени!" + "\n" +
                            "введите Ваше имя:");
                }
            }
            console.close();
        }
    }
}