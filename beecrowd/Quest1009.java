import java.io.IOException;
import java.util.Scanner;

public class Quest1009 {
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        String x = entradas.next();
        Double y = entradas.nextDouble(), z = entradas.nextDouble();
        entradas.close();
        System.out.printf("TOTAL = %.2f\n",y+((z*15)/100));
    }
}
