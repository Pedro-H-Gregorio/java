import java.io.IOException;
import java.util.Scanner;

public class Quest1008 {
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Integer x = entradas.nextInt(), y = entradas.nextInt();
        Double z = entradas.nextDouble();
        entradas.close();
        System.out.printf("NUMBER = %d\n",x);
        System.out.printf("SALARY = U$ %.2f\n",y*z);
    }
}
