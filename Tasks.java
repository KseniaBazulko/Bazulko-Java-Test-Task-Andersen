import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        isGreater();
        isJohn();
        multiplesOfThree();
    }

    public static void isGreater() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number >= 7) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
    }

    public static void isJohn() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }
    }

    public static void multiplesOfThree() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements multiples of 3:");
        for (int number : array) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
