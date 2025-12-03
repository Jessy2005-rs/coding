import java.util.Scanner;
public class q10bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int employmentType = sc.nextInt();

        boolean primaryEligible = primaryAge >= 21 && primaryAge <= 60;
        boolean addonEligible = addonAge > 18;
        boolean validEmployment = employmentType >= 1 && employmentType <= 4;

        if (primaryEligible && addonEligible && validEmployment) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
} 