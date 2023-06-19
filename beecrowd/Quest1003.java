import java.io.IOException;
import java.util.Scanner;

public class Quest1003 {

    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Integer x = entradas.nextInt(), y = entradas.nextInt();
        entradas.close();
        System.out.printf("PROD = %d\n",x*y);
    }
}