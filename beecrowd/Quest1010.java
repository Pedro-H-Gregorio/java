import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Quest1010 {
    public static void main(String[] args) throws IOException {
        Scanner entradas = new Scanner(System.in);
        Double total = Double.valueOf(0);
        for (int i = 0; i<2;i++){
            Double[] valores = Arrays.stream(entradas.nextLine().split(" ")).map(Double::valueOf).toArray(Double[]::new);
            total += valores[1]*valores[2];
        }
        
        entradas.close();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}
