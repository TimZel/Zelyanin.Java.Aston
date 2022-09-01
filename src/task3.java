import java.util.Scanner;

public class task3
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введите длину массива: ");
        int[] array = new int[console.nextInt()];
        array(array);
    }
    public static void array(int array[]){
        Scanner console = new Scanner(System.in);
        System.out.println("\n" + "введите " + array.length + " целых числа(ел) для заполнения массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        console.close();
        System.out.print("\n" + "элементы массива, кратные 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}   