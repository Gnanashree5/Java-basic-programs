import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; ++i) {
            System.out.print(n1 + " ");
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
