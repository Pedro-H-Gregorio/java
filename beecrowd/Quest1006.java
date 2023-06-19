import java.io.IOException;
import java.util.Scanner;

public class Quest1006 {
    
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Double x = entradas.nextDouble(), y = entradas.nextDouble(), z = entradas.nextDouble();
        entradas.close();
        System.out.printf("MEDIA = %.1f\n",((x*2+y*3+z*5)/10));
    }

}

