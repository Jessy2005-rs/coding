import java.util.Scanner;
public class q04year{
   int days = sc.nextInt();
        int years = days / 365;
        int months = (days % 365) / 30;
        int remDays = (days % 365) % 30;
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remDays);

 
}