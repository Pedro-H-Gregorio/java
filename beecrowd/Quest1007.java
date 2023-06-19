import java.io.IOException;
import java.util.Scanner;

public class Quest1007 {
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Integer x = entradas.nextInt(), y = entradas.nextInt(), 
        z = entradas.nextInt(), a = entradas.nextInt();
        entradas.close();
        System.out.printf("MEDIA = %d\n",x*y-z*a);
    }
}
