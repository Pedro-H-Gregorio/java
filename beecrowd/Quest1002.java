import java.io.IOException;
import java.util.Scanner;

public class Quest1002 {

    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Double raio = entradas.nextDouble();
        entradas.close();
        System.out.println(String.format("A=%.4f", 3.14159*Math.pow(raio, 2)).replace(",","."));
    }
}