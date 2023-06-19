import java.io.IOException;
import java.util.Scanner;

public class Quest1011 {
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Double raio = entradas.nextDouble();
        entradas.close();
        System.out.printf("VOLUME = %.3f\n", Math.pow(raio, 3)*4/3*3.14159);
    }
}
