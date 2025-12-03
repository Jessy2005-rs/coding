import java.util.Scanner;
public class q24prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) count++;
        System.out.println(count == 0 ? "Prime" : "Not Prime");
    }
}