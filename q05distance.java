import java.util.Scanner;
public class q05distance{
    double start = sc.nextDouble();
        double end = sc.nextDouble();
        double distance = end - start;
        double remuneration = Math.round(distance * 25 * 100.0) / 100.0;
        System.out.printf("%.2f %.2f\n", distance, remuneration);


}