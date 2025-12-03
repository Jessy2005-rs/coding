import java.util.Scanner;
public class q06minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Max=" + Math.max(a, b) + " Min=" + Math.min(a, b));
    }
}