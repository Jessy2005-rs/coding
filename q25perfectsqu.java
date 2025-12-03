import java.util.Scanner;
public class q25perfectsqu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = (int)Math.sqrt(num);
        System.out.println(sqrt * sqrt == num ? "Perfect Square" : "Not Perfect Square");
    }
}