import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        String numberStr = Integer.toString(num);
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversed = reversed * 10 + (numberStr.charAt(i) - '0');
        }

        System.out.println("Reversed number: " + reversed);
    }
}

