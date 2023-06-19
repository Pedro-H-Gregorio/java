import java.io.IOException;
import java.util.Scanner;

public class Quest1005 {
    
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Double x = entradas.nextDouble(), y = entradas.nextDouble();
        entradas.close();
        System.out.printf("MEDIA = %.5f\n",((x*3.5+y*7.5)/11));
    }

}
